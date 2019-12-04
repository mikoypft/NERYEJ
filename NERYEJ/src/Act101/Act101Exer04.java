package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer04 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Exercise 4:Trigonometry\n" );

		double a= Math.sin(.5236);
		double b= Math.cos(.5236);
		double c= (a*a)+(b*b);

		System.out.println("sine: " + a + " cosine: " + b + " sum: " + c+ "\n" );

	}

}
