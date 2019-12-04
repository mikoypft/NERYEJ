package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer39 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x,y,z,a=0, b=0,c=0;

		System.out.println("Exercise 39:In-range Adder");
		System.out.println("Low end range:");
		x=Integer.parseInt(br.readLine()); 
		System.out.println("High end range:");
		y=Integer.parseInt(br.readLine()); 
		do 
		{ 
		System.out.println("Enter data:");
		z=Integer.parseInt(br.readLine());  

		if(z>=x & z<=y){
		 b= b+z; 
		 
		}else{
		 c=c+z;
		}
		} 
		while(z>0);
		    System.out.println("Sum of in-range values: " +b);
		    System.out.println("Sum of out-range values: " +c+ "\n");

	}

}
