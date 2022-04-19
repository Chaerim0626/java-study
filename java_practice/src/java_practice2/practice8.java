package java_practice2;

class Sample {
	private Object obj;
	
	Sample(Object x) {
		this.obj = x;
	}
	
	public Object getObj() {
		return obj;
	}
	void printInfo() {
		System.out.println(obj.getClass().getName());
	}
}

public class practice8 {
	
	public static void main(String[] args) {
		//객체 생성-> 문자열
		Sample s1 = new Sample(12345);
		System.out.println(s1.getObj());
		s1.printInfo();
		
		//Object 자료형으로 선언하면 리턴시 반환 타입이 Object가 되는 문제 발생
		//처음에는 형변환으로 사용
		int num = (int)s1.getObj();
		System.out.println(num);
	}

}
