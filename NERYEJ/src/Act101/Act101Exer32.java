package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer32 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Exercise 32\n");
		System.out.print("Enter N :  \n");
		int N=Integer.parseInt(br.readLine());  

		double a=0;
		for(int i=1;i<=N ;i++){

		    a=a+(1.0/i);

		}System.out.print("The sum is "+a+ "\n");

	}

}
