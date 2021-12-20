package project4_배열과ArrayList;

public class ObjectCopy {
	
	public static void main(String[] args) {
		/* 
		 - 배열 복사하기
		 System.arraycopy(복사할배열, 복사할 첫 위치, 대상배열, 붙여넣을 첫 위치, 복사할 요소개수);
		 
		
		 - 다른 인스턴스를 가리키는 것 : 깊은 복사
		 
		 */
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3); //객체 배열 복사

		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
 		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("--------------");
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		} //얕은 복사
		
		
		String[] strArr = {"Java", "Android", "Python"};
		for(int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		
		//향상된 for문
		for(String s: strArr) {
			System.out.println(s);
		}
		
		
		int[] arr = {1, 2, 3, 4, 5};
		for (int num : arr) { //num = arr[i]
			System.out.println(num);
		}
	}

}
