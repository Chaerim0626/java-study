package java_practice2;

abstract class Car {
	abstract void run();
}

class Ambulance extends Car {
	void run() {System.out.println("엠뷸런스가 지나가요");}
}
	
class SportsCar extends Car {
	void run() {System.out.println("스포츠가가 지나가요");}
}

class Cultivate extends Car {
	void run() {System.out.println("경운기가 지나가요");}
}

public class practice5 {

	public static void main(String[] args) {

		//Car[] cars = new Car[3];
		//cars = new Car[] { new Ambulance(), new SportsCar(), new Cultivate()};
	
		//자식클래스로 객체 생성, 타입은 부모 타입
		Car[] cars = { new Ambulance(), new SportsCar(), new Cultivate()};
		
		//반복문으로 각 객체의 run() 호출
		for(int i=0; i < cars.length; i++)
		{
			System.out.println(cars[i]); //각 개체가 생성된 메모리 공간의 주소 값 출력
			cars[i].run();
		}

		
		for(Car obj: cars)
			obj.run();
	}
}