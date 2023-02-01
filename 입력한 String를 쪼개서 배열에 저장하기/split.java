
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		String a = "";
		String[] array;

		
			for (int i = 0; i < N; i++) {
				a = s.next();
				array = a.split(""); //""단위 즉 모든 알파벳이나 숫자등 하나씩 나눠서 배열에 저장 만약" "으로되면 띄어쓰기 기준으로 나눠서 배열에 저장.

				System.out.println(array[0]+array[a.length()-1]);
			}
			
	}
}
