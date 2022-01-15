package inheritance;


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagel extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagel());
		
	
	}
	
	public void moveAnimal(Animal animal ) {
		animal.move(); //다형성 구현, 가상함수
	}

}
