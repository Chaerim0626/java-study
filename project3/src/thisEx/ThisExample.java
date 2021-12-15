package thisEx;

import thisEx.Birthday;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; //지역변수를 멤버변수에 대입
	}
	
	public void printThis() {
		System.out.println(this); //그때의 인스턴스의 주소값
	}
	
}

public class ThisExample {

	public static void main(String[] args) {
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
	}
}