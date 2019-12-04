package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer23 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 23:Fantasy Game\n");
		System.out.print("Welcome to Yertle's Quest!\n");
		System.out.print("Enter the name of your character:  \n");
		String w=br.readLine(); 
		System.out.print("Enter strength (1-10): \n");
		int x=Integer.parseInt(br.readLine()); 
		System.out.print("Enter health (1-10): \n");
		int y=Integer.parseInt(br.readLine()); 
		System.out.print("Enter luck (1-10): \n");
		int z=Integer.parseInt(br.readLine()); 

		int a= x+y+z;

		if (a> 15){
		    
		  System.out.print("You have given your character too many points!"
		         +"Default values have been assigned: " +w+ " :strength: 5, health: 5, luck: 5 \n");          
		} else {
		   System.out.print("Character " +w+ " :strength: 5, health: 5, luck: 5 \n"); 
		}

	}

}
