package project4_배열과ArrayList;

public class TwoDimensionArray {
	
	public static void main(String[] args) {
		int [][] arr = new int[2][3]; //2차원 배열
	
		int [][] arr2 = {{1,2,3}, {4,5,6}};
		System.out.println(arr.length); //행의 길이
		System.out.println(arr[0].length); //열의 길이
	
		for(int i=0; i < arr2.length; i++) {
			for (int j=0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]); //배열 전체 출력
				
			}
		}
		
		//연습문제
		char [][] alphabets = new char[13][2];
	}

}
