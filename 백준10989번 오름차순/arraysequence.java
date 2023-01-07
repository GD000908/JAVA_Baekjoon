import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner s = new Scanner(System.in); 스태너대신 버퍼리더사용
		
		StringBuilder sb = new StringBuilder();
		
		
		int N = Integer.parseInt(br.readLine()); 
		//int N = s.nextInt(); 입력받기.
		
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			//num[i] = s.nextInt();
		}
		Arrays.sort(num);
		for (int i = 0; i < N; i++) {
			sb.append(num[i]).append('\n');
			
		}
		System.out.println(sb);

	}
}
