package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer08 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 8:Correct Change\n");

		System.out.print("Input the cents:\n");

		int cents=Integer.parseInt(br.readLine());
		int b= cents/100;
		int a= cents % 100;
		int c= a/25;
		int d= a % 25;
		int e= d /10;
		int f= d % 10;
		int g= f/5;
		int h= f % 5;

		System.out.print("Your change is " + b + " dollar/s, " + c + " quarters, " + e +
		        " dime, " + f + " cents and " + g + " nickels \n");

	}

}
