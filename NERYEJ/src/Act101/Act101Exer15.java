package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer15 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 15:Order Checker\n");
		System.out.print("Number of Bolts:\n");
		int x=Integer.parseInt(br.readLine());
		System.out.print("Number of Nuts:\n");
		int y=Integer.parseInt(br.readLine());
		System.out.print("Number of Washers:\n");
		int z=Integer.parseInt(br.readLine());

		int b= 5;
		int n= 3;
		int w= 1;

		System.out.print("Check the order\n");

		int t= (b*x)+ (n*y)+(w*z);

		System.out.print("Total Cost :\n" + t + "\n");

	}

}
