package kiosk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
	// ��ü �޴� ������
	public Map<String,String> totalMenu = new LinkedHashMap<>();
	private Map<String,String> orderMenu = new LinkedHashMap<>();
	Set<String> totalkey;
	Set<String> orderKey;

	// �� �޴� ������, Product�� Order���� ��ӹ޾� ����� �� �ְ� ��
	String menuName[][] = new  String[5][3];
	String menuDesc[][] = new  String[5][3];
	int menuPrice[][] = new  int[5][3];
	
	// Product, Order ����
	private Product product = new Product();
	private Order order = new Order();
	
	// Scanner�� �ٸ� Ŭ�����鿡�� ��� �޾� ����ϵ��� �� (�ٸ� Ŭ�����鿡�� close �ع����� ���α׷� ������ �� �ǹǷ� ���� ū Ʋ���� close�� ��)
	public Scanner scanner = new Scanner(System.in);

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
			int firstNum = scanner.nextInt();
			
			if(firstNum < i-1 && firstNum > 0 ) { // �ش� �� �޴� �������� �Ѿ��
				product.orderMenu(firstNum); 
				break;
			}else if (firstNum == i-1) { // ��ٱ��� ��� ���� ����
				order.showMenu();
				break;
			}else if(firstNum == i) { // �ֹ� ���� �ֹ� ����ϱ�
				order.resetMenu();
				break;
			}else {
				System.out.println("�߸��� �����Դϴ�. 1���� " + i + "������ ���� �Է����ּ���.");
			}
		}
	}
}
