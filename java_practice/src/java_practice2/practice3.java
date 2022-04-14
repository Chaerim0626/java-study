package java_practice2;

class Person2{
	String name;
	int age;
	int weight;
	
	Person2() {}
	Person2(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		
	}
	
	void wash() {System.out.println("씻다.");}
	void study() {System.out.println("공부하다.");}
	void play() {System.out.println("놀다.");}
}


interface Allowance {
	public static final String a = "Korea";
	abstract void in(int price, String name);
	abstract void out(int price, String name);
}

interface Train {
	abstract void train(int training_pay, String name);
}

class Student extends Person2 implements Allowance, Train{
	//같이 쓸 때는 extends 키워드가 먼저오게 씀
	
	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);
	}
	
	public void in(int price, String name) {
		System.out.printf("%s에게서 %d원 용돈을 받았습니다.%n", name, price);
	}
	public void out(int price, String name) {
		System.out.printf("%s로 %d원을 지출했습니다.%n", name, price);
	}
	public void train(int training_pay, String name) {
		System.out.printf("[%s --> %d원 입금완료]%n", name, training_pay);
	}
}

public class practice3 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Student s1 = new Student("홍길동", 20, 85);
		
		//2. 클래스와 인터페이스로부터 상속과 구현을 한 메서드 호출
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "나");
		s1.out(5000, "밥값");
		s1.train(1500000, "엄마");
		
		//3. 상수 필드 사용하기
		System.out.println(s1.a);
	}

}
