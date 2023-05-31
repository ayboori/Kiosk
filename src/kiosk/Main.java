package kiosk;

public class Main {

	public static void main(String[] args) {
		//클래스 객체들 생성
		Kiosk kiosk = new Kiosk();
		Screen screen = new Screen();
		
		
		while(true) {
			screen.printMenu();
			kiosk.getFirstMenu();
			
			
		}
		
		
	}
}
