package java_practice2;

class Human{
	
}

class Superman extends Human {
	
}

public class practice6 {

	public static void main(String[] args) {
	
		//1. 배열에서 다형성 사용을 못하면 각 객체별로 관리를 해야함
		Human[] h = new Human[10];
		h[0] = new Human();
		h[1] = new Superman();
		
		//2. 매개변수의 다형성
		//System.out.println()는 객체를 매개변수로 받아도 해당 객체 값을 출력 -> 다형성 활용
		//object는 최상위 타입
		System.out.println(new Human());
	}

}
