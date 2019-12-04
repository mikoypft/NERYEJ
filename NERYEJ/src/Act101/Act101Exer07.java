package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer07 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 7:Cents to Dollars\n");

		System.out.print("Input the cents:\n");

		int cents=Integer.parseInt(br.readLine());
		int b= cents/100;
		int a= cents % 100;


		System.out.print("That is " + b + " dollar/s and " + a + " cents \n");

	}

}
