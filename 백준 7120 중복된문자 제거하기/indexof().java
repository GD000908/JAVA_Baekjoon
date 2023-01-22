import java.util.Scanner;

public class Main {
	
	private static String solution(String str) { // private는 자기 자신 클래스에서만 접근 가능
		// main의 void와 달리 String가 있으므로 return값을 String으로 리턴해줌. 
		//static은 프로그램 실행시 메모리를 할당함으로서 프로그램이 끝날때까지 정리되지 않고 살아있음?
		// (String str)은 str을 String로 사용?
		
		String answer = ""; //answer라는 String변수 선언
		for (int i=0; i<str.length(); i++) { 
			if (str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		}
		
		return answer;
	}

	public static void main(String[] args) { //void 는 "함수가 끝날 때 리턴값이 없다" 라는 의미. 
		 
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();	
		System.out.println(solution(str));
	}

}
