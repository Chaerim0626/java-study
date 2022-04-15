package java_practice2;

class Person3 {
	String str1 = "난 부모 클래스";
	void method1() {
		System.out.println("오버라이딩 당할 부모 클래스의함수");
	}
}

class Student3 extends Person3 {
	
	String str2 = "난 자식 클래스";
	void method1() {
		System.out.println("오버라이딩한 함수");
	}
	void useSuper() {
		super.method1();
	}
	void cast( ) {System.out.println("자식에게만 있는 함수 호출");}
}

public class practice4 {

	public static void main(String[] args) {
		
		//1. 부모 + 자식 클래스의 모든 자원 사용 가능
		Student3 s1 = new Student3();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		
		//자식클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하려면?
		s1.useSuper();
		System.out.println("---------------------");
		
		
		//2. 부모의 자원만 사용 가능
		Person3 s2 = new Student3(); //자식클래스로 객체 만들면서 타입은 부모클래스 사용
		System.out.println(s2.str1); //str2사용 불가능
		s2.method1(); //오버라이딩한 것은 자식의 메서드로 실행됨
		
		//자식의 메서드를 바로 호출하고 싶으면? 캐스트 필요
		((Student3)s2).cast();
		
		//3. 부모의 자원 사용 가능
		Person3 p1 = new Person3();
		
		//4. Student3 p2 = new Person3(); 불가능

	}

}
