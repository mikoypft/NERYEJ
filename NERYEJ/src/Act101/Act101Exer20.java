package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer20 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 20:Internet Delicatessen\n");
		System.out.print("Enter the item:\n");
		String w=br.readLine();  
		System.out.print("Enter the price: \n");
		double x=Double.parseDouble(br.readLine());
		System.out.print("Overnight Delivery  (0==no, 1==yes) \n");
		int y=Integer.parseInt(br.readLine());

		int s=0;
		int d=0;
		int e=0;


		if (y==1){
		    e=d+5;
		}else if (y==0){
		    e=d+0;
		}
		    
		if (x<10){
		    s= 2;    
		}else if(x>=10){
		    s=3;
		}
		double t=(x+s)+e;
		double f=e+s;
		        
		System.out.print("Invoice:\n");
		System.out.print( w );
		System.out.print("\t"+ x );
		System.out.print( "\nShipping   " + f+ "\t");
		System.out.print( "\nTotal    " + t+ "\t\n" );

	}

}
