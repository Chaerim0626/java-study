package project4_배열과ArrayList;

public class 배열 {
	
	public static void main(String[] args) {
		/*
		 
		 - 배열
		 메모리상에 연속된 공간을 차지함
		 물리적, 논리적으로 연속되어있는 자료구조
		 무조건 0번째 요소부터 시작
		 
		 
		 - 배열의 선언
		 1. 자료형[] 배열이름 = new 자료형[개수];
		 2. 자료형 배열이름[] = new 자료형 [개수];
		 	 
		 
		 */
		
		int[] numbers = new int[] {0, 1, 2}; //배열 초기화
		
		int[] number2 = new int[3];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		System.out.println(numbers.length);
		
	}
}

