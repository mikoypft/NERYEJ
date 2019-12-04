package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer26 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 26:More Tire Pressure\n");
		System.out.print("Input right front pressure:  \n");
		int w=Integer.parseInt(br.readLine());  
		if (w>=35 & w<=45){
		}else{
		System.out.print("Warning: pressure is out of range!\n");}

		System.out.print("Input left front pressure:  \n");
		int x=Integer.parseInt(br.readLine());  
		if (x>=35 & x<=45){
		}else{
		System.out.print("Warning: pressure is out of range!\n");}

		System.out.print("Input right rear pressure:  \n");
		int y=Integer.parseInt(br.readLine());
		if (y>=35 & y<=45){
		}else{
		System.out.print("Warning: pressure is out of range!\n");}

		System.out.print("Input left rear pressure:  \n");
		int z=Integer.parseInt(br.readLine()); 
		if (z>=35 & z<=45){
		}else{
		System.out.print("Warning: pressure is out of range!\n");}

		boolean goodpressure= true;

		if (goodpressure==(w>=35 & w<=45 &x>=35 & x<=45& y>=35 & y<=45 & z>=35 & z<=45)){
		    System.out.print("Inflation is GOOD!\n");
		}
		else{System.out.print("Inflation is BAD!\n");}

	}

}
