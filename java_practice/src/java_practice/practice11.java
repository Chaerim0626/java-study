package java_practice;

class Person2{
	//Field
	private String name;
	private int age;
	private int height;
	private int weight;
	//private는 클래스 내에서만 접근 가능
	//getter, setter를 통해 멤버 필드의 값을 필요에 따라 사용
	
	//Constructor
	Person2() {
		
	}
	Person2(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
	
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() { return age; }
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public void setWeight(int weight) { this.weight = weight;}
	public int getWeight() {return weight;}
	
	public void move() {
		System.out.println("이동중...");
	}
	
}

class Villain2 extends Person2{
	//Field
	private String unique_key;
	private int weapon;
	private double power;
	
	//Consturctor
	Villain2() {}
	Villain2(String name, int age, int height, int weight, String unique_key,int weapon, double power){
		super(name, age, height, weight);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
		
	}
	
	
	//Method
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	public String getUnique_key() {return unique_key;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}
	
	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	public void printPerson() {
		System.out.println("-----------------------");
		System.out.println("악당 이름 : " + getName());
		System.out.println("악당 나이 : " + getAge());
		System.out.println("악당 키 : " + getHeight());
		System.out.println("악당 체중 : " + getWeight());
		System.out.println("악당 넘버 : " + getUnique_key());
		System.out.println("악당 무기 : " + getWeaponName(getWeapon()));
		System.out.println("악당 파워 : " + getPower());
		System.out.println("-----------------------");
	}
	
	public String getWeaponName(int a) {
		String weapon;
		switch(a) {
			case 1:
			weapon="창";
			break;
			case 2:
				weapon="방패";
				break;
			case 3:
				weapon="총";
				break;
			default:
				weapon="---";
				break;
		}
		return weapon;
	}
}

class Hero2 extends Person2{
	
}


public class practice11 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Villain2 v1 = new Villain2("좀비", 20, 180, 80, "15001231", 1, 99.5);
		v1.printPerson();
		System.out.print(v1.getName() + "");
		v1.move();
		
	}

}
