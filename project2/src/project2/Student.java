package project2;

public class Student {
	//클래스는 대부분 대문자로 시작, public 클래스는 단하나
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
				
		studentLee.showStudentInfo();
	}
}
