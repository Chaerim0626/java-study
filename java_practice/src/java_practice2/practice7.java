package java_practice2;

class Point{

	   Point(){}
	   public void motherClass() {
	      System.out.println("이것은 부모 클래스");
	   }
	}
	class inheritance extends Point{
	   
	   public void motherClass() {
	      System.out.println("이것은 자식 클래스");
	   }
	   public void motherClassEx() {
	      super.motherClass();
	   }
	}
	public class practice7 {
	   public static void main(String args[]) {
	   inheritance i = new inheritance();
	   Point p = (Point)i;
	   
	   p.motherClass();
	   
	   
	   }
	}