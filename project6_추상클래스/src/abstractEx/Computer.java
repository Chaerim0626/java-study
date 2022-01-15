package abstractEx;

public abstract class Computer { 
	//추상클래스는 상속을 하기위해 만듦, 인스턴스화 할 수 없음
	
	public abstract void display(); //메소드 선언만
	public abstract void typeing(); //추상 메소드
	//여기서는 어떻게 구현될지 모름 - 각각 상속받은 클래스에서 구체적으로 구현해야 할 때 사용
	//하위클래스에 위임
	
	
	//일반 메소드들도 하위클래스에서 오버라이딩을 통해 재정의 가능
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
