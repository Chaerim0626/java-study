package string;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = new String("abc"); //string문자열은 불변
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //주소값 다름
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //동일한 메모리 가리킴
	
		//두개의 문자열 연결하면 새로운 메모리 생성
		
	}
}
