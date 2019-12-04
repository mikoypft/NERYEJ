package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer28 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 28\n");
		System.out.print("Enter Start:  \n");
		int w=Integer.parseInt(br.readLine());  
		System.out.print("Enter End:  \n");
		int x=Integer.parseInt(br.readLine());  

		while(w<= x) {
		   System.out.println(w);
		   
		   w++;

		}

	}

}
