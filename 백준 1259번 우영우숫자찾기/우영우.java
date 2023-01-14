import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			String N = sc.next();
			if(N.equals("0")) System.exit(0); // N과 0이 같다면 시스템 종료. for문 나오기.
			
			String[] arr = new String[N.length()]; //배열의 크기를 내가 입력하는 N의 길이만큼으로 설정. 가변적 길이설정 가능.
			String[] arr2 = new String[N.length()];
			
			for(int i=0;i<N.length();i++) {
         arr[i] = N.substring(i,i+1);
      }
			
			//배열 reverse
			for(int i=0;i<N.length();i++) {
				arr2[i] = arr[N.length()-1-i]; //배열의 길이가 10이라고 할 때 10-1-i하면 arr[9], arr[8], arr[7]... 이런식으로 역정렬로 나타낼수 있다. 
			}
			
			int count = 0;
			//문자가 같으면 count ++
			for(int i=0;i<N.length();i++) { // arr[i].equals(arr2[i]  => arr[i]정상배열과 arr2[i] 역정렬 배열과 같으면 count++
				if(arr[i].equals(arr2[i])) count++; // 만약 10자리 배열을 받았을때 정상배열과 역정렬 배열이 같다면 count는 10번이 같아서 10이 된다. 
			}
			
			//count가 같다면 yes, 다르면 no 출력
			if(count==N.length()) System.out.println("yes"); 
			else System.out.println("no");
			
		}
	}
}
