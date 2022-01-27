package temp;

public class Practice4 {
	
	public static void main(String[] args) {
		
		for (int i= 65; i< 91; i++) {
			System.out.print((char)i+ " ");	
		}
		System.out.println();
		
		int x = 1;
		while (x <= 30) {
		
			if(x % 2 == 0)
			{
				System.out.print(x + " ");
			}
			x++;
			
		}
		
		System.out.println();
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr[1]);
		
		for(int j : arr) {
			System.out.print(j + " ");
		}
		
	}

}
