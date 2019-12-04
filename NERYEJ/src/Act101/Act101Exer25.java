package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer25 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 25:Tire Pressure\n");
		System.out.print("Input right front pressure:  \n");
		int w=Integer.parseInt(br.readLine());  
		System.out.print("Input left front pressure:  \n");
		int x=Integer.parseInt(br.readLine());  
		System.out.print("Input right rear pressure:  \n");
		int y=Integer.parseInt(br.readLine());  
		System.out.print("Input left rear pressure:  \n");
		int z=Integer.parseInt(br.readLine()); 

		if(w==x & y==z){
		System.out.print("Inflation is OK! \n");
		}else{
		System.out.print("Inflation is not OK! \n");  
		}

	}

}
