package kiosk;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Product();
		while(true) {
			menu.printMenu();
		}
	}
}
