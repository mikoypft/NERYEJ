package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer43 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Exercise 43:Drug Potency\n" );
		double  effect=100.0;
		int month=0;

		while (effect>=50) {
		effect = effect -(effect* 0.04);

		System.out.println("Month: " + (month = month + 1) + "   Effectiveness: " + effect );}

		System.out.print("The medicine can only be stored for 17 months!");

	}

}
