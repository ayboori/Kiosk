package kiosk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
	// 전체 메뉴 변수들
	public Map<String,String> totalMenu = new LinkedHashMap<>();
	public Map<String,String> orderList = new LinkedHashMap<>();
	Set<String> totalkey;
	Set<String> orderKey;

	// 상세 메뉴 변수들, Product와 Order에서 상속받아 사용할 수 있게 함
	String menuName[][] = new  String[5][3];
	String menuDesc[][] = new  String[5][3];
	int menuPrice[][] = new  int[5][3];
	
	// Scanner을 다른 클래스들에서 상속 받아 사용하도록 함 (다른 클래스들에서 close 해버리면 프로그램 진행이 안 되므로 가장 큰 틀에서 close할 것)
	public Scanner scanner = new Scanner(System.in);

	Menu(){ // 생성자에서 메뉴 명 초기화
		totalMenu.put("Coffee","컴포즈 고유 원두를 사용한 커피");
		totalMenu.put("Non-Coffee","에스프레소가 포함되지 않은 우유 메뉴");
		totalMenu.put("Smoothie","컴포즈 대표 메뉴인 시원한 스무디");
		totalMenu.put("Milk Shake","크림과 우유가 들어가 달달한 밀크쉐이크");
		totalMenu.put("Side Menu","매장에서 직접 구운 와플,크로플");
		
		orderList.put("Order","장바구니를 확인 후 주문합니다.");
		orderList.put("Cancel","진행중인 주문을 취소합니다.");
		
		totalkey = totalMenu.keySet();
		orderKey = orderList.keySet();
		
		}
}
