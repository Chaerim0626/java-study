package java_practice;

public class practice3 {
	
	public static void sum(Integer a) {
		a+=400;
		System.out.println(a); //100이라는 값 출력 
	}

	public static void main(String[] args) {
		//wrapper 클래스의 integer클래스 타입으로 변수a를 선언하고 new로 객체를 생성하여 해당 주소값을 메소드를 보낸다.
		 
		Integer a = new Integer(100); //new하는 순간 주소값 반환, 객체는 참조형타입
		sum(a);
		System.out.println(a); //call by value처럼 동작
	}

}
