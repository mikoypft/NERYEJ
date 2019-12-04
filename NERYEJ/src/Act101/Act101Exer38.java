package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer38 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Exercise 38:Miles per Gallon");
		int x;
		do 
		{
		System.out.println("Enter initial miles:");
		x=Integer.parseInt(br.readLine());  
		 
		if(x > 0){
		 
		System.out.println("Enter final miles:");
		int y=Integer.parseInt(br.readLine());  
		 
		System.out.println("Gallons");
		int z=Integer.parseInt(br.readLine());  
		 
		float a = y - x;
		float b = a /z;
		 
		System.out.println("The miles per mallons: " + b+ "\n");
		}
		 
		} while(x > 0);

		System.out.println("Thank You for using our service! See you next time...\n");

	}

}
