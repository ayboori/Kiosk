package kiosk;

import java.util.ArrayList;

public class Order extends Product {
	ArrayList<String> shopName = new ArrayList<String>();
	ArrayList<String> shopDesc = new ArrayList<String>();
	ArrayList<Integer> shopPrice = new ArrayList<Integer>();
	int totalPrice =0;
	
	public void addMenu(int firstNum, int menuNum) {
		// ��ٱ��Ͽ� �Ʊ� ������ ��� �߰�
		shopName.add(menuName[firstNum][menuNum]);
		shopDesc.add(menuDesc[firstNum][menuNum]);
		shopPrice.add(menuPrice[firstNum][menuNum]);
		totalPrice += menuPrice[firstNum][menuNum];
	}
	
	public void showMenu() {
		System.out.println("=======================================");
		for (int i =0; i < shopName.size(); i++) {
			System.out.println("\n ** " + shopName.get(i) + " | " + shopPrice.get(i) + "�� | " + shopDesc.get(i) + " **" );
		}
		System.out.println("[ Total Price ]\n" + totalPrice + " ��");
		System.out.println("���� ���� �ֹ� �Ͻðڽ��ϱ�?");
	}
	
	public void resetMenu() {
		
	}
	

	
}
