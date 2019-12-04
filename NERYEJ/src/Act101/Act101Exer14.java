package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer14 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 14:Discount Prices\n");
		System.out.print("Enter Amount of Purchase:\n");
		int X=Integer.parseInt(br.readLine());

		double D= X-(X*0.10);
		System.out.print("Discounted Price:\n" + D+ "\n");

	}

}
