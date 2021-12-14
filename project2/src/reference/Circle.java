package reference;

public class Circle {
	
	Point point; //클래스 안에서 다른 클래스 가져다 쓰기
	int radius;
	
	public Circle() {
		point = new Point();
	}

}
