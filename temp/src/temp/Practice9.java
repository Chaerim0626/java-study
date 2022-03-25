package temp;

public class Practice9 {
	
	public static void showMenu() {
		System.out.println("ShowMenu() 메서드가 호출되었습니다.");
	}
	
	public static void plus(int n1, int n2) {
		int res = n1+n2;
		System.out.println(res);
	}
	
	public static int returnMethod() {
		int result = 100;
		return result;
	}

	public static void main(String[] args) {
		
		//반환값 X 인자값 X
		showMenu();
		
		//반환값 X 인자값 O
		plus(2,5);
		
		//반환값 O 인자값 X
		returnMethod();
	}
	
	//
}
