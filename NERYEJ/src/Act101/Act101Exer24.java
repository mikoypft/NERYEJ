package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer24 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 24:Check Charge\n");
		System.out.print("Checking account balance:  \n");
		double x=Double.parseDouble(br.readLine());  
		System.out.print("Savings account balance:  \n");
		double y=Double.parseDouble(br.readLine());  

		double a,b;


		if (x>1000){
		    a=0;
		}else{
		    a=0.15;
		}

		if(y>1500){
		    b=0;
		}else{
		    b=0.15;
		}
		double c= a+b;
		System.out.print("Service Charge:  " +c+ "\n");

	}

}
