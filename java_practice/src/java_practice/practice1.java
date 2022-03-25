package java_practice;

public class practice1 {

	
	public static String capitalMethod(String str) {
		String res = str.toUpperCase(); //대문자로 변경
		return res;
	}
	public static void main(String[] args) {
		
		
		//반환값O 인자값O
		String res;
		res = capitalMethod("korea");
		
		System.out.println(res);
		

	}

}
