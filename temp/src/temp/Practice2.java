package temp;

public class Practice2 {

	public static void main(String[] args) {
		
		byte b = 21;
		System.out.printf("나는 %d살의 대학생입니다.", b);

		byte b1 = 10;
		System.out.printf("10은 8진수로 %o, 16진수로는 %x입니다.", b1,b1);
	
		System.out.println();
		
		//정수형 문자열로 변환해 정수의 자릿수 구하기
		int a = 12345;
		String str = "12345";
		
		String stra = String.valueOf(a); //정수 -> 문자열로 변환
		System.out.println(stra.length()); //정수 자릿수
	
		int b2 = Integer.valueOf(str); //문자열 -> 정수로 변환
		System.out.println(b2+1);
	}
}
