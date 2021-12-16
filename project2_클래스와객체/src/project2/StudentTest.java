package project2;

public class StudentTest {

	public static void main(String[] args) {
		//class 사용법 (다른 클래스에서 불러쓸 수도 있음)
		
		Student studentLee = new Student(); //디폴트 생성자
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 서초구 서초동";
		
		Student studentKim = new Student(); //인스턴스 여러개 생성하기
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

		System.out.println(studentLee); //힙 메모리에 생성된 주소값 출력
	
	}
	
	
}
