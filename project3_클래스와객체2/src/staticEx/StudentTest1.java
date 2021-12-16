package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentJ = new Student();
		System.out.println(studentJ.studentID); //자동으로 ID +1 하고 싶음
		
		
		Student studentT = new Student();
		
		System.out.println(studentT.studentID);
		
		System.out.println(Student.serialNum); //static변수는 클래스 이름으로 참조
		System.out.println(Student.serialNum);
		
	}
}
