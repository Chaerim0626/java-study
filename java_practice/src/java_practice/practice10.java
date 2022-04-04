package java_practice;


class Person {
	//Field
	int gender;
	int power;
	
	//Constructor
	Person() {
		this.gender = 1;
		this.power = 100;
	}
	//Method
	void walk() {
		System.out.println("걸어가고 있어요");
	}
	
}

class Hero extends Person {
	String name;
	int age;
	
	Hero(){}
	Hero(String name, int age){
		super(); //부모클래스의 생성자를 호출
		this.name = name;
		this.age = age; 
	}
	
	void walk() {
		//오버라이딩 - 재정의해서 다른용도로 사용
		System.out.println("2배로 빨리 걸어가고 있어요");
	}
	
	void eat( ) {
		System.out.println("밥먹고 있어요");
	}
	
	void displayPerson() {
		System.out.println("이름 : " + name + "나이 : " + age + "성별 : " + gender + "파워 : " + power);
	}
}

class Villain {
	
}


public class practice10 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Person p1 = new Person();
		p1.walk();
		
		
		//2. 상속을 통한 슈퍼맨 객체 생성
		Hero h1 = new Hero("슈퍼맨", 20);
		System.out.println(h1.age);
		System.out.println(h1.name);
		System.out.println(h1.gender);
		System.out.println(h1.gender); //부모클래스 필드 (변수)
		
		h1.walk();
		h1.displayPerson();
		
		//3. 원더우먼 객체 생성
		Hero h2 = new Hero("원더우먼", 30);
		h2.gender = 2;
		h2.power = 300;
		h2.displayPerson();
		h2.walk();
		

	}

}
 