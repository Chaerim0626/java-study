package java_practice2;

abstract class Animal {
	//구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 --> 리턴값 조차도 없이 메서드명만 선언
	abstract void cry();
	
}
class Dog extends Animal {
	void cry() {System.out.println("멍멍");}
}
class Cat extends Animal {
	void cry(){System.out.println("야용");}
}


public class practice2 {

	public static void main(String[] args) {
		
		//1. 추상클래스는 구체적 내용이 없어 객체 생성 불가능

		
		//2. 추상클래스 사용 -> 상속 받아 사용
		//추상 클래스를 상속받은 자식클래스에서 해당 메서드를 오버라이딩하여 재정의한 후 사용
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
	}
}
