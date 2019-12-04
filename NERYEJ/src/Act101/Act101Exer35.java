package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer35 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 35:Power of a number\n");
		System.out.print("Enter X :  \n");
		float X=Float.parseFloat(br.readLine());
		System.out.print("Enter N :  \n");
		int N=Integer.parseInt(br.readLine());

		if (N<0){
		System.out.print("N must be positive number \n");}
		else {System.out.println(+X+ " raised to " +N+ " is " +Math.pow(X, N)+ "\n");}

	}

}
