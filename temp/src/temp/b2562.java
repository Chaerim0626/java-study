package temp;

import java.util.*;
public class b2562 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int index = 0;
		int arr[] = new int[9];
		for (int i=0; i <9 ; i++) {
			arr[i] = sc.nextInt();
			max = Math.max(arr[i],max);
		}

		for(int j=0; j<arr.length; j++) {
			if (arr[j] == max) {
				index = j+1;
			}
		}

		System.out.println(max);
		System.out.println(index);
	}

}
