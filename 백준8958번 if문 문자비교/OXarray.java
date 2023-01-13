// 처음에 몇개의 배열케이스를 만들지 정하고 그 후 내가 입력한 문자가 O이면 +1 아니면 0을 더한다. 
// o o o x o o o  인경우 1+2+3+0+1+2+3 =12가 된다.

import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String arr[] = new String[in.nextInt()];  //배열의 크기를 내가 입력한 정수의 크기로 설정.
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();  
		}
		
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {  //입력한 문자가 O 면 cnt +1
					cnt++;
				} 
				else {
					cnt = 0; //아니면 +0
				}
				sum += cnt; 
			}
			
			System.out.println(sum);
		}
	}
}
