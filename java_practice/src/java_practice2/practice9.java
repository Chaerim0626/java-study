package java_practice2;
class Person4{
	public Object obj;
	
	Person4(Object obj){
		this.obj = obj;
	}
}
class Student4{
	
	public int grade;
	
	Student4(int grade) {this.grade = grade;}
}

class Teacher{
	
}


public class practice9 {
	public static void main(String[] args)
	{
		Person4 p1 = new Person4(new Student4(1));
		//컴파일 단계에서 경고없이 컴파일이 잘됨 -> 형변환에서 실수가 일어날 수 있어서 제네릭 탄생
		Teacher t1 = (Teacher)p1.obj;
		
	}

}
