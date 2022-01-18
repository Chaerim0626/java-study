package interfaceEx;

public interface Calc {
	//interface에는 상수와 추상메소드가 선언
	
	
	//public static final (상수)
	double PI = 3.14;
	int ERROR = -9999999;
	
	
	//public abstract
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}
	
}
