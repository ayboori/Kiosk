package kiosk;

import java.util.Scanner;

public class Kiosk {
	// 다른 클래스들 모두 참조
	private Product product;
	private Order order;
	private Menu menu;
	
	public Scanner scanner = new Scanner(System.in);
	
	int waitNum = 1; // 대기번호
	
	Kiosk(){
		product = new Product();
		order = new Order();
		menu = new Menu();
	}
	
	public boolean printMenu() {
		int i = 0;
		
		// 메뉴판 출력
		System.out.println("Compose Coffee에 오신걸 환영합니다 !");
		System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요. \n");

		System.out.println("[ COMPOSE MENU ]");
		
		for (String key : menu.totalkey) {
			System.out.println(++i + ". " + key + " | " + menu.totalMenu.get(key));
		}
		System.out.println("\n [ ORDER MENU ]");
		
		for (String key : menu.orderKey) {
			System.out.println(++i + ". " + key + " | " +  menu.orderList.get(key));
		}

		System.out.println("==========프로그램을 종료하시려면 "+ (int)(i+1) + "을 입력하세요===========");
		
			// 숫자 입력 받아 적절한 함수 실행 / 예상 밖의 값이면 다시 입력받음
		while(true) {
			int firstNum = scanner.nextInt();
			
			if(firstNum < i-1 && firstNum > 0 ) { // 해당 상세 메뉴 페이지로 넘어가기
				orderMenu(firstNum); 
				break;
			}else if (firstNum == i-1) { // 장바구니 목록 보러 가기
				showMenu();
				break;
			}else if(firstNum == i) { // 주문 중인 주문 취소하기
				System.out.println("진행하던 주문을 취소하시겠습니까? (범위 이외 값 입력 시 주문 취소 안 됨)\r\n" + 
						"1. 확인        2. 취소");
				int sure = scanner.nextInt();
				if(sure == 1) {
					order.resetMenu();		
					System.out.println("메뉴가 초기화 되었습니다.");
					System.out.println("=======================================\n");
				}else {
					System.out.println("주문이 취소되지 않았습니다. \n" + "=======================================");
				}
				break;
			}else if(firstNum == i+1){ // 프로그램 종료 입력 시 종료
				System.out.println("프로그램이 종료됩니다. \n안녕히 가세요.");
				break;
			}
			else { // 잘못된 숫자 입력시
				System.out.println("잘못된 숫자입니다. 1부터 " + i + "사이의 값을 입력해주세요.");
			}
		}
		
		return true;
	}
	
	void orderMenu(int firstNum) {
		// 메뉴판 출력
		System.out.println("=======================================");
		System.out.println("Compose Coffee에 오신걸 환영합니다 !");
		System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요. \n");
		System.out.println("[ " + "MENU ]");
		
			for (int i=0; i<product.menuName[firstNum-1].length ;i++) { // 매개변수 기반으로 선택한 메뉴 출력
				System.out.println(i+1 + ". " +product.menuName[firstNum-1][i] + " | " + product.menuPrice[firstNum-1][i] + "원 | " + product.menuDesc[firstNum-1][i] );
			}
		
			int menuNum;
		
			while(true) {
				menuNum = scanner.nextInt() -1;
				if (menuNum + 1 > product.menuName[firstNum-1].length || menuNum < 0) {
					System.out.println("잘못된 값입니다.");
				}else {
					break;					
				}
			}
		
			System.out.println("\n ** " + product.menuName[firstNum-1][menuNum] + " | " + product.menuPrice[firstNum-1][menuNum] + "원 | " + product.menuDesc[firstNum-1][menuNum] + " **" );
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인                         2. 취소");
			
			int orderNum = scanner.nextInt();
			while(true) {
				if (orderNum ==1) {
					order.addMenu(firstNum-1,menuNum);
					break;			
				}else if (orderNum == 2) {
					System.out.println("선택을 취소하셨습니다. 초기 화면으로 돌아갑니다. \n");
					System.out.println("=======================================");
					break;
				}else {
					System.out.println("잘못된 숫자입니다. 1이나 2를 입력해주세요.");
				}
			}
	}
	
	public void showMenu() {
		System.out.println("=======================================");
		System.out.println("[ 장바구니 목록 ] \n");
		
		for (int i =0; i < order.shopName.size(); i++) {
			System.out.println("** " + order.shopName.get(i) + " | " + order.shopPrice.get(i) + "원 | " + order.shopDesc.get(i) + " **" );
		}
		System.out.println("\n [ Total Price ]\n" + order.totalPrice + " 원");
		System.out.println("위와 같이 주문 하시겠습니까?");
		System.out.println("1. 확인                 2. 취소 ");
		
		while(true) {
			int finalQ = scanner.nextInt();

			if (finalQ ==1) {
				System.out.println("주문이 완료되었습니다!\n");
				System.out.println("대기번호는 " + waitNum++ + "번입니다.\n");
				System.out.println("=======================================");
				order.resetMenu();
				
				break;			
			}else if (finalQ == 2) {
				System.out.println("선택을 취소하셨습니다. 초기 화면으로 돌아갑니다. \n");
				System.out.println("=======================================");
				break;
			}else {
				System.out.println("잘못된 숫자입니다. 1이나 2를 입력해주세요.");
			}
		}
	}
		
}
