package temp;
import java.util.*;
public class b10952 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int total = 0;
		int n = num;
		int n1 = 0;
		int n2 = 0;
		
		while(true) {
			
			n1 = num % 10 * 10; //10ÀÇ ÀÚ¸´¼ö
			n2 = num / 10 + (num % 10) % 10;
			if (n2 > 9) {
				n2 = n2 % 10;
			}
			num = n1 + n2;
					
			total++;
			if (num == n) break;

		}
		System.out.println(total);
	}

}
