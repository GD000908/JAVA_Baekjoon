// 배열의 기본 문제. 
// 배열안의 들어갈 정수의 크기를 입력 받고 그 배열안에 내가 찾고자 하는 숫자가 총 몇개인지 출력해주는 문제. 

import java.util.Scanner;

public class Main {

	public static void main(String[] args){ 
		
		int count = 0;					// 입력받을 숫자의 개수 
		int[] num;						// 입력받을 배열 
		int search;						// 검색할 숫자 
		int searchCheck = 0;			// 검색한 숫자 체크 
		int a;
		
		Scanner scanner = new Scanner(System.in);
		// 입력받을 숫자 개수 입력받기
		System.out.println("입력할 숫자의 개수는 ? (100개 미만) : ");
		count = scanner.nextInt();
		num = new int[count];		 //내가 입력 받을 배열의 크기가 몇인지 정함. 
		// 숫자 입력받기 
		System.out.println(count + " 개의 숫자를 입력하세요 : ");
		for (int i = 0 ; i < count ; i++) {
			num[i] = scanner.nextInt();	 //배열의 원소를 입력 받음
		}
		System.out.println( " 찾을숫자를 입력하시오.: ");
		search = scanner.nextInt(); //검색할 정수는?
		for(int i = 0; i<count; i++)
		{
			if(search == num[i])
			{
				searchCheck = searchCheck+1; //내가 찾고자 하는 숫자가 있을때마다 searchCheak를 하나씩 더함.
			}
		}
		System.out.print(search+"의 개수는 "+searchCheck+"입니다."); 
	}
}
