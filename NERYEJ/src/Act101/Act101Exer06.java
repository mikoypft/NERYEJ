package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer06 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 6:Area of a Circle\n");

		System.out.print("The radius of the circle is:\t");
		int r=Integer.parseInt(br.readLine());

		double area = r*r * Math.PI;

		System.out.print("The area of the circle is:\t" + area+ "\n");

	}

}
