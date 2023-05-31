package kiosk;

import java.util.ArrayList;

public class Order extends Product {
	ArrayList<String> shopName = new ArrayList<String>();
	ArrayList<String> shopDesc = new ArrayList<String>();
	ArrayList<Integer> shopPrice = new ArrayList<Integer>();
	int totalPrice =0;
	
	public void addMenu(int firstNum, int menuNum) {
		// 장바구니에 아까 선택한 목록 추가
		shopName.add(menuName[firstNum][menuNum]);
		shopDesc.add(menuDesc[firstNum][menuNum]);
		shopPrice.add(menuPrice[firstNum][menuNum]);
		totalPrice += menuPrice[firstNum][menuNum];
	}
	
	public void showMenu() {
		System.out.println("=======================================");
		for (int i =0; i < shopName.size(); i++) {
			System.out.println("\n ** " + shopName.get(i) + " | " + shopPrice.get(i) + "원 | " + shopDesc.get(i) + " **" );
		}
		System.out.println("[ Total Price ]\n" + totalPrice + " 원");
		System.out.println("위와 같이 주문 하시겠습니까?");
	}
	
	public void resetMenu() {
		
	}
	

	
}
