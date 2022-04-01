package java_practice;

class Person1 {
	
	//1. 속성
	int age;
	String name;
	
	//2. 생성자
	Person1() {}
	Person1(int age, String name){
		this.age = age; //this는 생성된 객체 자신을 의미
		this.name = name;
	} //생성자 오버로딩
	
	
	//3. 메소드
	void printPerson() {
		System.out.println("나이 : " + age + " 이름 : " + name);
	}
	
}
public class practice9 {

	public static void main(String[] args) {
		
	//1. 생성자 : Constructor
	//생성자는 new키워드로 클래스의 객체가 생성될 때 제일 먼저 자동적으로 호출되는 메소드
	//객체의 초기값을 설정하는 용도로 많이 사용
	//생성자명은 클래스명과 동일
	
		
	//2. 생성자 위치
	//보통 속성과 메소드 사이에 기술
		
		
	//3. 객체 생성
	Person1 p1 = new Person1(20,"홍길동");
	Person1 p2 = new Person1(30, "이순신");
	Person1 p3 = new Person1(40, "을지문덕");
	
	p1.printPerson();
	p2.printPerson();
	p3.printPerson();
	

	}

}
