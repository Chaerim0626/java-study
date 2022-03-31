package java_practice;

class FarmMachine {
	
	//속성
	int price; 
	int year;
	String color;
	
	//동작
	void move() {System.out.println("Farmmachine is moving.");}
	void dig() {
		System.out.println("Farmmachine is digging");
	}
	void grind() {
		System.out.println("Farmmachine is grinding");
	}
	
}

public class practice7 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		FarmMachine fm = new FarmMachine(); //메모리 공간상 객체 생성, 주소값 반환
		System.out.println(fm);
		
		//2. 생성된 객체에 속성 값 입력
		fm.price = 1000000;
		fm.year = 2022;
		fm.color = "red";
		
		//3. 속성값 출력
		String fm_price = String.format("%,d", 1000000);
		System.out.println(fm_price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//4. 동작 수행
		fm.move();
		fm.dig();
		fm.grind();
	}

}
