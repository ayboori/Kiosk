package kiosk;


public class Main {

	public static void main(String[] args) {
		//Ŭ���� ��ü�� ����
		Kiosk kiosk = new Kiosk();
		
		while(true) {
			if(kiosk.printMenu()) {
				return; // ���α׷� ���� �Է� �� ���α׷� ����
			}
		}
	}
}
