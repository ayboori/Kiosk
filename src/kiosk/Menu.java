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

	Menu(){ // �����ڿ��� �޴� �� �ʱ�ȭ
		totalMenu.put("Coffee","������ ���� ���θ� ����� Ŀ��");
		totalMenu.put("Non-Coffee","���������Ұ� ���Ե��� ���� ���� �޴�");
		totalMenu.put("Smoothie","������ ��ǥ �޴��� �ÿ��� ������");
		totalMenu.put("Milk Shake","ũ���� ������ �� �޴��� ��ũ����ũ");
		totalMenu.put("Side Menu","���忡�� ���� ���� ����,ũ����");
		
		orderMenu.put("Order","��ٱ��ϸ� Ȯ�� �� �ֹ��մϴ�.");
		orderMenu.put("Cancel","�������� �ֹ��� ����մϴ�.");
		
		totalkey = totalMenu.keySet();
		orderKey = orderMenu.keySet();
	}
	public void printMenu() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		// �޴��� ���
		System.out.println("Compose Coffee�� ���Ű� ȯ���մϴ� !");
		System.out.println("�Ʒ� �޴����� ���ð� �޴��� ��� �Է����ּ���. \n");

		System.out.println("[ COMPOSE MENU ]");
		
		for (String key : totalkey) {
			System.out.println(++i + ". " + key + " | " + totalMenu.get(key));
		}
		System.out.println("\n [ ORDER MENU ]");
		
		for (String key : orderKey) {
			System.out.println(++i + ". " + key + " | " +  orderMenu.get(key));
		}
		
		
		// ���� �Է� �޾� ������ �Լ� ���� / ���� ���� ���̸� �ٽ� �Է¹���
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
				System.out.println("�߸��� �����Դϴ�. 1���� " + i + "������ ���� �Է����ּ���.");
			}
		}
	}
}
