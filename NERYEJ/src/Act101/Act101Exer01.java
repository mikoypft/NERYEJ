package Act101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer01 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double x=3;
		double a=(3*x*x)-(8*x)+4;
		System.out.print("Exercise 1:Value of a Quadratic\n");
		System.out.print("At x=");
		System.out.print(x);
		System.out.print(" the value is ");
		System.out.print(+a+ "\n");

	}

}
