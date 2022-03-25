package java_practice;

public class practice2 {
	
	public void helloWorld() {
		System.out.println("Hello World");
	} 
	
	public static void main(String[] args) {
		
		//helloWorld();
		//메인메서드는 static메소드만 호출 가능 
		
		practice2 p = new practice2();
		p.helloWorld(); 
	} 

}
