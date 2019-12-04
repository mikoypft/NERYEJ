package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer10 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 10\n");
		System.out.print("Enter cost per kilowatt-hour in cents :\n");
		double c=Double.parseDouble(br.readLine());
		System.out.print("Enter kilowatt-hours used per year :\n");
		double k=Double.parseDouble(br.readLine());

		double a = (c+ 0.0)*(k+ 0.0);


		System.out.print("Annual Cost:\n");
		System.out.print(+a+ "\n");

	}

}
