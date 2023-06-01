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
		}else { // 장바구니에 아까 선택한 목록 추가
			shopName.add(menuName[firstNum][menuNum]);
			shopDesc.add(menuDesc[firstNum][menuNum]);
			shopPrice.add(menuPrice[firstNum][menuNum]);
			shopCount.add(1); // 처음 추가되는 경우 메뉴 갯수 1개
			totalPrice += menuPrice[firstNum][menuNum];			
		}
		
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
