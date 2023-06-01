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
		System.out.println("메뉴가 장바구니에 추가되었습니다.");
		System.out.println("=======================================\n");
	}
	
	public void resetMenu() {
		shopName.clear();
		shopDesc.clear();
		shopPrice.clear();
		totalPrice = 0;
	}
	

	
}
