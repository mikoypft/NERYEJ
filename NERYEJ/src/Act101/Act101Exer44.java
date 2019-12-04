package Act101;
import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
public class Act101Exer44 {

	public static void main(String[] args) throws IOException{
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Exercise 44:e^x");	     
		System.out.println("Enter x:");
		int x = Integer.parseInt(dataIn.readLine());
			      
		int n = 1;
		double t = 0,sum = 1,N = 1 / 1.0e12;
			      
			      
			      do {
			        double factorial = 1;
			        for(int i = 1; i <= n; i++) {
			          factorial *= i;
			        }
			        
			        t = Math.pow(x, n) / factorial;
			        sum += t;
			        
			        System.out.print("n: " + n++);
			        System.out.print("\tterm: " + t);
			        System.out.print("\tsum: " + sum + "\n");
			        
			      }while(t > N);
			      
			      System.out.println("My e^x: " + sum);
			      System.out.println("The real e^x: " + Math.exp(x));

	}

}
