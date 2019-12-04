package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer09 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 9:Ohm's Law\n");

		System.out.print("Input the voltage:\n");
		int V=Integer.parseInt(br.readLine());
		System.out.print("Input the resistance:\n");
		int R=Integer.parseInt(br.readLine());

		double I = (V + 0.0)/R;


		System.out.print("The current is: " +I+ "\n");

	}

}
