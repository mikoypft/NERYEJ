package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer13 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 13\n");
		System.out.print("Enter X:\n");
		float X=Float.parseFloat(br.readLine());
		System.out.print("Enter Y:\n");
		float Y=Float.parseFloat(br.readLine());

		float A= (X+Y)/2;
		float H= 2 / ( 1/X + 1/Y );

		System.out.print("Arithmetic mean: "+ A+ "\n" );
		System.out.print("Harmonic mean: "+ H + "\n" );

	}

}
