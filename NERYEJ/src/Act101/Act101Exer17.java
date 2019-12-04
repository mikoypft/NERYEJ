package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer17 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 17:Pie Eating Contest\n");
		System.out.print("Input Contestant's Weight:\n");
		int x=Integer.parseInt(br.readLine());

		if (x>=30 & x<=250){
		     System.out.print("The contestant is allowed in the contest\n");
		} 
		else{
		     System.out.print("The contestant is not allowed in the contest\n");   
		}

	}

}
