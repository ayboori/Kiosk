package kiosk;

import java.util.ArrayList;

public class Order extends Product {
	ArrayList<String> shopName = new ArrayList<>();
	ArrayList<String> shopDesc = new ArrayList<>();
	ArrayList<Integer> shopPrice = new ArrayList<>();
	ArrayList<Integer> shopCount = new ArrayList<>();
	int totalPrice =0;
	int num;
	
	public void addMenu(int firstNum, int menuNum) {
		
		if(shopName.contains(menuName[firstNum][menuNum])) {
			num = shopName.indexOf(menuName[firstNum][menuNum]);
			int count = shopCount.get(num); // 
			shopCount.set(num, ++count );
		}else { // ��ٱ��Ͽ� �Ʊ� ������ ��� �߰�
			shopName.add(menuName[firstNum][menuNum]);
			shopDesc.add(menuDesc[firstNum][menuNum]);
			shopPrice.add(menuPrice[firstNum][menuNum]);
			shopCount.add(1); // ó�� �߰��Ǵ� ��� �޴� ���� 1��
			totalPrice += menuPrice[firstNum][menuNum];			
		}
		
		System.out.println("�޴��� ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
		System.out.println("=======================================\n");
	}
	
	public void resetMenu() {
		shopName.clear();
		shopDesc.clear();
		shopPrice.clear();
		totalPrice = 0;
	}
}
