package kiosk;

public class Main {

	public static void main(String[] args) {
		//Ŭ���� ��ü�� ����
		Kiosk kiosk = new Kiosk();
		Screen screen = new Screen();
		
		
		while(true) {
			screen.printMenu();
			kiosk.getFirstMenu();
			
			
		}
		
		
	}
}
