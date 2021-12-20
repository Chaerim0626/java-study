package project4_배열과ArrayList;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		
		//A~Z까지 넣기
		char[] alphabets = new char[26];
		
		char ch = 'A'; //65
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			alphabets[i] = ch;
		}
		
		for(int i=0; i<alphabets.length; i++, ch++) {
			System.out.println(alphabets[i]);
		}
	}

}
