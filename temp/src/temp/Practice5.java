package temp;
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		//사용자 입력을 위한 객체 선언
		Scanner sc = new Scanner(System.in);
		
		//2차원 배열의 행과 열 선언 -> 입력으로 처리
		System.out.print("행의 개수 입력하고 enter 치세요 = ");
		int R = sc.nextInt(); //정수 입력
		
		System.out.print("열의 개수 입력하고 enter 치세요 = ");
		int C = sc.nextInt();
		
		
		//char 2차원 배열 선언 -> gameMap[R][C]생성
		
		char[][] gameMap = new char[R][C];
		
		//사용자 입력받아 저장할 String 배열 선언
		//안쪽 for문을 돌면서 2차원 배열에 입력
		String[] strAr = new String[R];
		
		//2차원 배열요소 -> 사용자가 입력하는 값으로 세팅
		for(int i=0; i < R; i++) {
			System.out.print((i+1) + "번째 행에 입력할 문자"+ C +"개를 차례대로 입력하고 enter 치세요");
			strAr[i] = sc.next();
			for(int j=0; j< C; j++) {
				gameMap[i][j] = strAr[i].charAt(j);
			}
		}
		System.out.println("--------------------");
		for(int i= 0; i < R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	

}
