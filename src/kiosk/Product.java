package kiosk;

public class Product extends Menu {
	
	Product(){
		// 1번의 메뉴 이름, 설명, 가격 추가
		menuName[0][0] = "아메리카노";
		menuName[0][1] = "카페라떼";
		menuName[0][2] = "아인슈페너라떼";		

		menuDesc[0][0] = "카페인 - 2shot, 15kcal";
		menuDesc[0][1] = "카페인 - 2shot, 204kcal";
		menuDesc[0][2] = "카페인 - 2shot, 301kcal";		

		menuPrice[0][0] = 1500;
		menuPrice[0][1] = 2700;
		menuPrice[0][2] = 3900;
		
		// 2번의 메뉴 이름, 설명, 가격 추가
		menuName[1][0] = "더블초코라떼";
		menuName[1][1] = "고구마라떼";
		menuName[1][2] = "민트초코오레오라떼";		

		menuDesc[1][0] = "399kcal, 당류 34g";
		menuDesc[1][1] = "363kcal, 당류 37g";
		menuDesc[1][2] = "530kcal, 당류 47g";		

		menuPrice[1][0] = 3500;
		menuPrice[1][1] = 3300;
		menuPrice[1][2] = 3900;
		
		// 3번의 메뉴 이름, 설명, 가격 추가
		menuName[2][0] = "블루베리 스무디";
		menuName[2][1] = "유자 스무디";
		menuName[2][2] = "망고요거트 스무디";		

		menuDesc[2][0] = "268kcal, 당류 66g";
		menuDesc[2][1] = "314kcal, 당류 54g";
		menuDesc[2][2] = "455kcal, 당류 82g";		

		menuPrice[2][0] = 3500;
		menuPrice[2][1] = 3500;
		menuPrice[2][2] = 3800;
		
		// 4번의 메뉴 이름, 설명, 가격 추가
		menuName[3][0] = "커피 밀크쉐이크";
		menuName[3][1] = "쿠키 밀크쉐이크";
		menuName[3][2] = "팥절미 밀크쉐이크";		

		menuDesc[3][0] = "565kcal, 당류 51g";
		menuDesc[3][1] = "671kcal, 당류 62g";
		menuDesc[3][2] = "704kcal, 당류 78g";		

		menuPrice[3][0] = 4200;
		menuPrice[3][1] = 4200;
		menuPrice[3][2] = 4200;
		
		// 5번의 메뉴 이름, 설명, 가격 추가
		menuName[4][0] = "오레오생크림 와플";
		menuName[4][1] = "티라미수 크루아상 와플";
		menuName[4][2] = "사과생크림 와플";		

		menuDesc[4][0] = "두툼하고 바삭한 와플에 생크림과 쿠키 크런치";
		menuDesc[4][1] = "버터향의 크로플 위에 커피원액,크림,코코아파우더";
		menuDesc[4][2] = "옛날 스타일의 사과잼 생크림 와플";		

		menuPrice[4][0] = 3000;
		menuPrice[4][1] = 3500;
		menuPrice[4][2] = 2500;

	}
}
