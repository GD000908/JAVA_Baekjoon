import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String StringValue = s.next(); //입력하고자 하는 문자열 입력.	
		String newStringValue = StringValue.replaceAll("[a-z,-]",""); // a-z(소문자)와 - 를  "" 즉 없앤다는 의미.

		System.out.println("[기존 문자열: StringValue]");
		System.out.println(StringValue); //예시) Knuth-Morris-Pratt출력 
		System.out.println("\n[변경된 문자열: newStringValue]");
		System.out.println(newStringValue); // KMP 출력

		//str의 문자열에서 특정 문자를 기준으로 자르고 싶을떄 사용. 
    	String str = "Knuth-Morris-Pratt";
    	String[] array = str.split("-"); // - 를 기준으로 배열에 삽입. 
    			    
    	//출력				
    	for(int i=0;i<array.length;i++) {
    	System.out.println(array[i]);
    	}
    	// 출력
    	//array[0]  Knuth
    	//array[1]  Morris
    	//array[2]  Pratt 이런식으로 - 를 기준으로 문자열을 배열에 저장한다. 
    	
	}
}
