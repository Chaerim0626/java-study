package java_practice;

public class practice8 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = a+b;
		String a1 = "1";
		String b1 = "2";
		String c1 = a1+ b1;
		
		//문자열 숫자로 변환 후 연산
		//Integer 클래스의 static 지정 (static은 객체의 생성없이 클래스명.메소드명()바로 사용 가능)
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt((b1));
		System.out.println(a2+b2); //3
		
		//진수 지정, parseInt(숫자, 진법) 다른 진수를 10진수로 바꾸어줌
		System.out.println(Integer.parseInt("2022", 10)); //10진수로 지정
		System.out.println(Integer.parseInt("1001", 2)); //9
		
		
	}

}
