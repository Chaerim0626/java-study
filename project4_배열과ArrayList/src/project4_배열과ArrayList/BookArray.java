package project4_배열과ArrayList;

public class BookArray {
	
	public static void main(String[] args) {
		
		
		
		Book[] library = new Book[5]; //객체 배열 생성
		
		
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		//객체 자료형은 객체를 각각 생성해서 배열에 넣어줘야함
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		} //주소값 생성
		
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo(); //void형 반환
		}
		
		
		
		
	}

}
