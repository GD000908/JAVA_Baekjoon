import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		
		
		Scanner s  =  new Scanner(System.in);
		
		int[] arr;
		arr = new int[9];
		for(int i=0; i<9; i++)
		{
			arr[i] = s.nextInt();
		}	 
        // 최대값 초기값 세팅
        int max = arr[0];
        int maxindex = 0;
        // 최대값 구하기
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }
        System.out.println(max);
        System.out.print(maxindex+1);
		
		
	}
}
