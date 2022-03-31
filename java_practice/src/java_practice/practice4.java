package java_practice;

class TestNumber {
	int num;
	TestNumber(int num){
		this.num = num;
	}
}

public class practice4 {
	
	public static void sum(TestNumber a) {
		System.out.println(a); //TestNumber 주소값
		System.out.println(a.num); //100출력
		a.num += 400;
		System.out.println(a.num);
	}

	public static void main(String[] args) {
		//객체 변수 선언
		TestNumber a = new TestNumber(100);
		sum(a); //주소값에 의해 sum메소드 호출
		System.out.println(a.num);
	}

}