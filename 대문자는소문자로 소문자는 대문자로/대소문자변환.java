import java.util.Scanner;
//백준 2744 대문자는 소문자로 소문자는 대문자로 변경하기
public class Main {
   
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       String input=sc.nextLine();
       
       //소문자와 대문자의 아스키코드값의 차이가 32이다.
       // A-65  Z-90  a-97  z-122 
       
       char[] arr;
       arr= input.toCharArray();  //입력받은 input String을 배열에 하나씩 쪼개서 넣어준다.
       
       //65<= char <=90 이면 대문자, 97<= char <= 122 이면 소문자이다. 
       for(int i=0; i<arr.length; ++i){
           if(65<=arr[i] && arr[i]<=90){ //대문자에 해당하는 문자가 들어있는 배열칸을 
               arr[i]=(char)(arr[i]+32); // 32를 더하여 소문자로 변경해준다. 
               continue;
               }
           if (97<=arr[i] && arr[i]<=122){  //소문자에 해당하는 문자가 들어있는배열칸을 
               arr[i]=(char)(arr[i]-32);   // 32를 빼서 대문자로 변경해준다. 
               continue;
           } //그러면 예를 들어 Apple라고 했을때 arr[0]은 대문자 arr[1]~[4]는 소문자였으므로
           }// arr[0]은 소문자 arr[1]~[4]은 대문자로 변경하여 arr배열에 저장한다. 
      
           System.out.print(arr); //aPPLE가 출력이 된다. 
       }
   }
