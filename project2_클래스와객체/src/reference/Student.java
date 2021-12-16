package reference;

public class Student {
	
	int studentID;
	String studentName;

	Subject korea; //참조 자료형
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) { //생성자 오버로딩
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() { //정보꺼내기
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
