package java_practice;
import java.util.*;

import java.util.Arrays;

public class practice5 {

	public static int[] testMethod() {
		int num1 = 100;
		int num2 = 200;
		return new int[] {num1, num2};
	}
				
	public static void main(String[] args) {
		int res[] = testMethod();
		System.out.println(res[0] + res[1]);
		System.out.println(res); //주소값 출력
		System.out.println(Arrays.toString(res)); //전부 출력

	}

}
