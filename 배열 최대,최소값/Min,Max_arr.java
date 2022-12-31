import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
        
		in.close();
		Arrays.sort(arr); //배열을 차순으로 정렬해준다. 
		System.out.print(arr[0] + " " + arr[N - 1]); //오름차순이므로 arr[0]은 최소값. arr[N-1]은 최대값
	}
}
