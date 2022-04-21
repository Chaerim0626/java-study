
package java_practice2;
class Sample2<T>{
	private T obj;
	
	Sample2(T x){this.obj = x;}
	T getObj() {return obj;}
	void printInfo() {
		System.out.println(obj.getClass().getName());
	}
}


public class practice10 {

	public static void main(String[] args) {
		
		Sample2<String> s1 = new Sample2<String>("æ»≥Á«œººø‰");
		System.out.println(s1.getObj());
		
		Sample2<Integer> s2 = new Sample2<Integer>(100);
		System.out.println(s2.getObj());
		s2.printInfo();
		
		String str = s1.getObj();
		System.out.println(str.length());
		
	}

}
