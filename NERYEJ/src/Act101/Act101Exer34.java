package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer34 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 34:Adding up Squares and Cubes\n");
		System.out.print("Upper Limit:  \n");
		int n=Integer.parseInt(br.readLine());
		int a;
		int b;

		a= (n*(n+1)*(2*n+1))/6 ;
		b=((n*n)*((n+1)*(n+1)))/4;

		System.out.print("The sum of Squares is :  " +a+ "\n");
		System.out.print("The sum of Cubes is :  " +b+ "\n");

	}

}
