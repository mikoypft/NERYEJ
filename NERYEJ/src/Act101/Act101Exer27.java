package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer27 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 27:The Pressure is Building\n");
		System.out.print("Input right front pressure:  \n");
		int w=Integer.parseInt(br.readLine());  
		System.out.print("Input left front pressure:  \n");
		int x=Integer.parseInt(br.readLine());  
		System.out.print("Input right rear pressure:  \n");
		int y=Integer.parseInt(br.readLine());
		System.out.print("Input left rear pressure:  \n");
		int z=Integer.parseInt(br.readLine());

		boolean goodpressure= true;

		if (goodpressure==(w-x>3 || x-w>3 || z-y>3 || y-z>3)){
		    System.out.print("Inflation is BAD!\n");
		}else{System.out.print("Inflation is OK!\n");}

	}

}
