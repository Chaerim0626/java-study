package thisEx;


class Person{
	
	String name;
	int age;
	
	
	public Person() {
		 this("이름없음",1); //안드로이드에서 많이 사용
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this; //자기자신 주소 반환
	}
}
public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
	
		System.out.println(p1.returnSelf());
	}
}
