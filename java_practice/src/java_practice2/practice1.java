package java_practice2;

class Person{
	String name;
	int age;
	
	Person() {}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	
}


public class practice1 {

	public static void main(String[] args) {
		
		Person[] pa = new Person[10]; //객체 배열 선언
		//Person타입의 객체 5개 생성
		
		for (int i=0; i<pa.length; i++) {
			pa[i] = new Person(i+ "번 후보자", i+20);
			
			//1. getter, setter 메서드 사용해서 출력
			System.out.println(pa[i].getName() + " --> " + pa[i].getAge());
		
			//2. array index 사용해 출력 -> private 선언 삭제하고 사용
			System.out.println(pa[i].name + pa[i].age);
			
			//3. printf
			System.out.printf("%s의 나이는 %d살 입니다.", pa[i].name, pa[i].age);
		
		}
		
	}

}
