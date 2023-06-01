package kiosk;

import java.util.Scanner;

public class Kiosk {
	// �ٸ� Ŭ������ ��� ����
	private Product product;
	private Order order;
	private Menu menu;
	
	public Scanner scanner = new Scanner(System.in);
	
	int waitNum = 1; // ����ȣ
	
	Kiosk(){
		product = new Product();
		order = new Order();
		menu = new Menu();
	}
	
	public boolean printMenu() {
		int i = 0;
		
		// �޴��� ���
		System.out.println("Compose Coffee�� ���Ű� ȯ���մϴ� !");
		System.out.println("�Ʒ� �޴����� ���ð� �޴��� ��� �Է����ּ���. \n");

		System.out.println("[ COMPOSE MENU ]");
		
		for (String key : menu.totalkey) {
			System.out.println(++i + ". " + key + " | " + menu.totalMenu.get(key));
		}
		System.out.println("\n [ ORDER MENU ]");
		
		for (String key : menu.orderKey) {
			System.out.println(++i + ". " + key + " | " +  menu.orderList.get(key));
		}

		System.out.println("==========���α׷��� �����Ͻ÷��� "+ (int)(i+1) + "�� �Է��ϼ���===========");
		
			// ���� �Է� �޾� ������ �Լ� ���� / ���� ���� ���̸� �ٽ� �Է¹���
		while(true) {
			int firstNum = scanner.nextInt();
			
			if(firstNum < i-1 && firstNum > 0 ) { // �ش� �� �޴� �������� �Ѿ��
				orderMenu(firstNum); 
				break;
			}else if (firstNum == i-1) { // ��ٱ��� ��� ���� ����
				showMenu();
				break;
			}else if(firstNum == i) { // �ֹ� ���� �ֹ� ����ϱ�
				System.out.println("�����ϴ� �ֹ��� ����Ͻðڽ��ϱ�? (���� �̿� �� �Է� �� �ֹ� ��� �� ��)\r\n" + 
						"1. Ȯ��        2. ���");
				int sure = scanner.nextInt();
				if(sure == 1) {
					order.resetMenu();		
					System.out.println("�޴��� �ʱ�ȭ �Ǿ����ϴ�.");
					System.out.println("=======================================\n");
				}else {
					System.out.println("�ֹ��� ��ҵ��� �ʾҽ��ϴ�. \n" + "=======================================");
				}
				break;
			}else if(firstNum == i+1){ // ���α׷� ���� �Է� �� ����
				System.out.println("���α׷��� ����˴ϴ�. \n�ȳ��� ������.");
				break;
			}
			else { // �߸��� ���� �Է½�
				System.out.println("�߸��� �����Դϴ�. 1���� " + i + "������ ���� �Է����ּ���.");
			}
		}
		
		return true;
	}
	
	void orderMenu(int firstNum) {
		// �޴��� ���
		System.out.println("=======================================");
		System.out.println("Compose Coffee�� ���Ű� ȯ���մϴ� !");
		System.out.println("�Ʒ� ��ǰ�޴����� ���ð� ��ǰ�� ��� �Է����ּ���. \n");
		System.out.println("[ " + "MENU ]");
		
			for (int i=0; i<product.menuName[firstNum-1].length ;i++) { // �Ű����� ������� ������ �޴� ���
				System.out.println(i+1 + ". " +product.menuName[firstNum-1][i] + " | " + product.menuPrice[firstNum-1][i] + "�� | " + product.menuDesc[firstNum-1][i] );
			}
		
			int menuNum;
		
			while(true) {
				menuNum = scanner.nextInt() -1;
				if (menuNum + 1 > product.menuName[firstNum-1].length || menuNum < 0) {
					System.out.println("�߸��� ���Դϴ�.");
				}else {
					break;					
				}
			}
		
			System.out.println("\n ** " + product.menuName[firstNum-1][menuNum] + " | " + product.menuPrice[firstNum-1][menuNum] + "�� | " + product.menuDesc[firstNum-1][menuNum] + " **" );
			System.out.println("�� �޴��� ��ٱ��Ͽ� �߰��Ͻðڽ��ϱ�?");
			System.out.println("1. Ȯ��                         2. ���");
			
			int orderNum = scanner.nextInt();
			while(true) {
				if (orderNum ==1) {
					order.addMenu(firstNum-1,menuNum);
					break;			
				}else if (orderNum == 2) {
					System.out.println("������ ����ϼ̽��ϴ�. �ʱ� ȭ������ ���ư��ϴ�. \n");
					System.out.println("=======================================");
					break;
				}else {
					System.out.println("�߸��� �����Դϴ�. 1�̳� 2�� �Է����ּ���.");
				}
			}
	}
	
	public void showMenu() {
		System.out.println("=======================================");
		System.out.println("[ ��ٱ��� ��� ] \n");
		
		for (int i =0; i < order.shopName.size(); i++) {
			System.out.println("** " + order.shopName.get(i) + " | " + order.shopPrice.get(i) + "�� | " + order.shopDesc.get(i) + " **" );
		}
		System.out.println("\n [ Total Price ]\n" + order.totalPrice + " ��");
		System.out.println("���� ���� �ֹ� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ȯ��                 2. ��� ");
		
		while(true) {
			int finalQ = scanner.nextInt();

			if (finalQ ==1) {
				System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�!\n");
				System.out.println("����ȣ�� " + waitNum++ + "���Դϴ�.\n");
				System.out.println("=======================================");
				order.resetMenu();
				
				break;			
			}else if (finalQ == 2) {
				System.out.println("������ ����ϼ̽��ϴ�. �ʱ� ȭ������ ���ư��ϴ�. \n");
				System.out.println("=======================================");
				break;
			}else {
				System.out.println("�߸��� �����Դϴ�. 1�̳� 2�� �Է����ּ���.");
			}
		}
	}
		
}
