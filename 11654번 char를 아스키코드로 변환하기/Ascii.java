import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		
		char ch1 = s.next().charAt(0);

		int numAscii = (int)ch1; //chi의 아스키코드 변환
		System.out.print(numAscii);
	}
}
