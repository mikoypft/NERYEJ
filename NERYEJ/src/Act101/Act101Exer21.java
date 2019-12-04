package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer21 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 21:Steam Engine Efficiency\n");
		System.out.print("Input Air Temperature:\n");
		float Tair=Float.parseFloat(br.readLine());  
		System.out.print("Input Steam Temperature: \n");
		float Tsteam=Float.parseFloat(br.readLine()); 

		float efficiency=0;

		if (Tsteam < 373){
		     efficiency=0;
		}else {
		     efficiency= (1 - Tair) / Tsteam;
		}

		System.out.print("Maximum Efficiency is: " +efficiency+ "\n");

	}

}
