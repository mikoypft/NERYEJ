package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer11 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 11\n");
		System.out.print("Enter the number of seconds:\n");
		double t=Double.parseDouble(br.readLine());

		double g= 32.174;
		double d = (g*t*t)/2 ;

		System.out.print("Distance:\n");
		System.out.print(+ d+ " feet \n");

	}

}
