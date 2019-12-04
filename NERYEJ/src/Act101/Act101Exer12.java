package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer12 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 12\n");
		System.out.print("Enter a double:\n");
		double X=Double.parseDouble(br.readLine());

		double a= Math.log( X )/ Math.log(2);

		System.out.print("Base 2 log of " + X + " is: " +a+ "\n");

	}

}
