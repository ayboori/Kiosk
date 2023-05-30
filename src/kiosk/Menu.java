package kiosk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public abstract class Menu {
	public Map<String,String> totalMenu = new LinkedHashMap<>();
	private Map<String,String> orderMenu = new LinkedHashMap<>();
	Set<String> totalkey;
	Set<String> orderKey;

	public Scanner scanner = new Scanner(System.in);
	
	abstract void orderMenu(int num);

	Menu(){ // 생성자에서 메뉴 명 초기화
		totalMenu.put("Coffee","컴포즈 고유 원두를 사용한 커피");
		totalMenu.put("Non-Coffee","에스프레소가 포함되지 않은 우유 메뉴");
		totalMenu.put("Smoothie","컴포즈 대표 메뉴인 시원한 스무디");
		totalMenu.put("Milk Shake","크림과 우유가 들어가 달달한 밀크쉐이크");
		totalMenu.put("Side Menu","매장에서 직접 구운 와플,크로플");
		
		orderMenu.put("Order","장바구니를 확인 후 주문합니다.");
		orderMenu.put("Cancel","진행중인 주문을 취소합니다.");
		
		totalkey = totalMenu.keySet();
		orderKey = orderMenu.keySet();
	}
	public void printMenu() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		// 메뉴판 출력
		System.out.println("Compose Coffee에 오신걸 환영합니다 !");
		System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요. \n");

		System.out.println("[ COMPOSE MENU ]");
		
		for (String key : totalkey) {
			System.out.println(++i + ". " + key + " | " + totalMenu.get(key));
		}
		System.out.println("\n [ ORDER MENU ]");
		
		for (String key : orderKey) {
			System.out.println(++i + ". " + key + " | " +  orderMenu.get(key));
		}
		
		
		// 숫자 입력 받아 적절한 함수 실행 / 예상 밖의 값이면 다시 입력받음
		while(true) {
			int num = scanner.nextInt();
			
			if(num < i-1 && num > 0 ) {
				orderMenu(num);
				break;
			}else if (num == i-1) {
				
				break;
			}else if(num == i) {
				
				break;
			}else {
				System.out.println("잘못된 숫자입니다. 1부터 " + i + "사이의 값을 입력해주세요.");
			}
		}
	}
}
