package kiosk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
	// ��ü �޴� ������
	public Map<String,String> totalMenu = new LinkedHashMap<>();
	public Map<String,String> orderList = new LinkedHashMap<>();
	Set<String> totalkey;
	Set<String> orderKey;

	// �� �޴� ������, Product�� Order���� ��ӹ޾� ����� �� �ְ� ��
	String menuName[][] = new  String[5][3];
	String menuDesc[][] = new  String[5][3];
	int menuPrice[][] = new  int[5][3];
	
	// Scanner�� �ٸ� Ŭ�����鿡�� ��� �޾� ����ϵ��� �� (�ٸ� Ŭ�����鿡�� close �ع����� ���α׷� ������ �� �ǹǷ� ���� ū Ʋ���� close�� ��)
	public Scanner scanner = new Scanner(System.in);

	Menu(){ // �����ڿ��� �޴� �� �ʱ�ȭ
		totalMenu.put("Coffee","������ ���� ���θ� ����� Ŀ��");
		totalMenu.put("Non-Coffee","���������Ұ� ���Ե��� ���� ���� �޴�");
		totalMenu.put("Smoothie","������ ��ǥ �޴��� �ÿ��� ������");
		totalMenu.put("Milk Shake","ũ���� ������ �� �޴��� ��ũ����ũ");
		totalMenu.put("Side Menu","���忡�� ���� ���� ����,ũ����");
		
		orderList.put("Order","��ٱ��ϸ� Ȯ�� �� �ֹ��մϴ�.");
		orderList.put("Cancel","�������� �ֹ��� ����մϴ�.");
		
		totalkey = totalMenu.keySet();
		orderKey = orderList.keySet();
		
		}
}
