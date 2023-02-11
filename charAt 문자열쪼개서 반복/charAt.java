// 백준 2675번 
//내가 입력한 문자열을 하나씩 쪼개서 반복하고 싶은 횟수만큼 반복 함.


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// System.out.println("케이스의 개수 입력");
		int T = s.nextInt(); // 케이스의 개수
		String a = "";

		for (int i = 0; i < T; i++) {

			// System.out.println("반복할 횟수 입력");
			int R = s.nextInt();

			// System.out.println("문자열 입력");
			a = s.next();

			for (int k = 0; k < a.length(); k++) {
				for (int j = 0; j < R; j++) {
					System.out.print(a.charAt(k));
				}
			}
			System.out.println();
		}
	}
}
