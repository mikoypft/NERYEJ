package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer40 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 40:Shipping Cost Calculator\n");
		double x;

		        System.out.print("Weight of Order: ");
		         x=Double.parseDouble(br.readLine()); 
		        while(!(x == 0))
		        {if(x<10){
		            System.out.println("Shipping Cost: $" + 3);
		            System.out.println();
		            System.out.print("Enter weight of order: ");
		            x=Double.parseDouble(br.readLine()); 
		        }else {
		            System.out.println("Shipping Cost: $" + (3 + .25 * (x - 10)));
		            System.out.println();
		            System.out.print("Enter weight of order: ");
		            x=Double.parseDouble(br.readLine()); }
		        }
		        System.out.println("Bye!\n");

	}

}
