package java_practice;
import java.util.*;

public class practice6 {

	public static String[] strMethod(String str1, String str2) {
		
		String a = str1.toUpperCase();
		String b = str2.toLowerCase();
		String[] res = {a, b}; //리턴값 2개 저장할 배열 변수 선언
		return res;
	}
	public static void main(String[] args) {
		
		String[] res = strMethod("korea", "USA");
		//배열명 자체를 찍는 것은 주소값 출력, 주소값을 항상 가지고 다니자!
		System.out.println(Arrays.toString(res));
	}

}
