import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		 
		while (s.hasNext()) {
		    System.out.println(s.nextLine());
		}
		
    	
	}
}

//백준 11718번
// 한번에 여러줄의 문장을 붙여넣기 해서 입력하면 그대로 출력을 해준다. 
// hasNext는 입력을 받고 다음 입력이 있을때까지 무한정 기다린다. 
