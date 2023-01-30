//백준 2908번
import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
    
        if(flip(num)>flip(num2))
        {
        	System.out.println(flip(num));
        }
        else 
        	System.out.println(flip(num2));
    }
    
    public static int flip(int num){
        int result=0;
        while(num!=0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}
/*
원리는 4357을 입력 받는 다고 하고 이것을 거꾸로 하면 7534 이다.
7534 = ( 7 * 1000 )+( 5 * 100 ) + ( 3 *10 ) + (4 * 1) 

따라서 뒤집을 수 4357 의 %연산으로 7을 얻어서 1000을 곱하면 7000이 얻어진다.
다음 단계에선 5를 얻어서 100을 곱하면 500 이다.
이런식으로 반복하여 최종적으로 모두 더하면 7534가 완성됨.

 */


