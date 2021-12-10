package project1;

public class 자료형 {

	public static void main(String[] args) {
		
		//1. 기본출력
		System.out.println("Hello World");
		
		
		//2. 변수와 자료형
		int num = 10;
		int bNum = 0B1010; //이진수
		int oNum = 012; //8진수
		int hNum = 0XA; //16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
		
		//변수 : 값을 사용하기위해 선언하는 것(variable) 
		int num3; //변수 선언
		num3 = 10; //값 초기화
		int level = 20; //선언과 동시에 초기화
		
		/* 1. 변수이름은 알파벳, 숫자, _, $로 구성
		2. 대소문자 구분
		3. 숫자 시작 X, 키워드로 이름 사용 X */
		
		
		/* 자료형 
		정수형 : byte(1), short(2), int(4), long(8)
		문자형 : char(2)
		실수형 : float(4), double(8)
		논리형 : boolean(1)
	
	    */
		byte bData = -128;
		System.out.println(bData);
		
		
		char ch = 'A';
		System.out.println((int)ch);
		
		float fNum = 3.14F; //float형은 f나 F를 명시해야함 (long형도)
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		var dNum = 3.14; //전역변수는 var형 사용 X
		//값 변경 불가능
		
		
		//3. 상수 : 변하지 않는 값
		final double PI = 3.14;
		final int MAX_NUM = 100;
		
		//4. 리터럴 : 프로그램에서 사용하는 모든 숫자, 값, 논리 값
		//ex) 10, 3.14, true
		
		
		/* 5. 형 변환
		 
		묵시적인 형변환 : 자연스러운 형 변환, 작은 수에서 큰 수로
		명시적인 형변환 : 묵시적 반대
		*/
		byte bNum2 = 10;
		int num4 = bNum2;
		System.out.println(num4); //묵시적
		
		int iNum = 1000;
		byte bNum3 = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum3); //데이터 유실
		
		double dNum2 = 3.14;
		iNum = (int)dNum2;
		System.out.println(iNum); //소수점 이하 사라짐
	}

}