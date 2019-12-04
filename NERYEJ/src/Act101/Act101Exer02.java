package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 2:Re-assigning values to Variables\n");

		double x1=0.0;
		double x2=2.0;
		double x3=4.0;
		double a=(3*x1*x1)-(8*x1)+4;
		double b=(3*x2*x2)-(8*x2)+4;
		double c=(3*x3*x3)-(8*x3)+4;

		System.out.print("At x=0.0 the value is " +a+ "\n");
		System.out.print("At x=2.0 the value is "+b+ "\n");
		System.out.print("At x=4.0 the value is "+c+ "\n");

	}

}
