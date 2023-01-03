import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[31];  //1차원배열 생성
		
		for(int i=1; i<29; i++) {
			int success = sc.nextInt();
			student[success] = 1; // 입력한 숫자들은 해당 배열칸을 1(true)로 설정. 
		}
		for(int i=1; i<student.length; i++) {
			if(student[i]!=1) //1(true)가 아닌 false칸을 찾음.
				System.out.println(i);
		}
		
		
		sc.close();

	}

}
