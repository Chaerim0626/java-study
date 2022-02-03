package temp;
import java.util.*;

public class b10871 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr[] = new int[n1];
        for (int i=0; i< n1; i++) {
            arr[i] = sc.nextInt();
        }
        
        for ( int j =0; j<n1; j++){
            if (n2 <= arr[j])
                continue;
            else 
            {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
