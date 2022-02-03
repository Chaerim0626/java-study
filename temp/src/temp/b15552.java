package temp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class b15552 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		
		int N = Integer.parseInt(br.readLine()); //정수 입력받기
		StringTokenizer st;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
	
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
			//int형으로 바꾼 후 두 토큰을 더해준 값을 bw에 넣어줌
		}
	
		br.close();
        
		bw.flush();
		bw.close();
	}
	
	
}
