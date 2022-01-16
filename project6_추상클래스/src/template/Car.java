package template;

public abstract class Car { //추상클래스와 템플릿 메소드 활용
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void washCar() {} //구현함
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() { //하위클래스에서 수정 불가능 - 템플릿 메소드
		startCar();
		drive();
		
		wiper();
		
		stop();
		washCar(); //필요에 의해 재정의 해서 사용
		turnOff();
		
	}
}
