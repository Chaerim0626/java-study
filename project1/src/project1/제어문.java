package project1;

public class 제어문 {

	public static void main(String[] args) {
		
		int age = 11;
		
		//1. if문
		if (age < 8){
			System.out.println("미취학 아동입니다.");
		}
		else if (age < 14) {
			System.out.println("초등학생입니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
	}
}
