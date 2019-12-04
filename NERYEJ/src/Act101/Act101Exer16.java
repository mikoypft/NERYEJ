package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer16 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 16:Last Chance Gas\n");
		System.out.print("Tank Capacity:\n");
		int x=Integer.parseInt(br.readLine());
		System.out.print("Gage Reading:\n");
		int y=Integer.parseInt(br.readLine());
		System.out.print("Miles per Gallon:\n");
		int z=Integer.parseInt(br.readLine());   
		double a;
		double b;
		int c;

		a= (y/(100+0.0))*x;
		b= a*z;
		c=200;

		if(b<c){
		    System.out.print("Get Gas!\n");
		} else{
		   System.out.print("Safe to Proceed\n"); 
		}

	}

}
