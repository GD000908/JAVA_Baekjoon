
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static String Stringsort(String str) //return값이 있어야한다. 
	{
		String[] arrays = str.split("");
		String change ="";
		
		Arrays.sort(arrays);
		
		for(int i=0; i<arrays.length; i++)
		{
			change += arrays[i];
		}
		
		return change;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String a = s.next();
		
		System.out.print(Stringsort(a));
			
			
	}
}
