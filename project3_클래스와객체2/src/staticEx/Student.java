package staticEx;

public class Student {

	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	
	public Student() {
		serialNum++; //생성자가 호출될때마다 학번 증가
		studentID = serialNum; //ID는 각각 인스턴스마다 갖게 됨
	}
}
