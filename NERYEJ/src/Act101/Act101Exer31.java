package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer31 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 31:Adding up Integers\n");
		System.out.print("How many integers will be added:  \n");
		int w=Integer.parseInt(br.readLine());  

		int a=0;
		while(w>0){
		System.out.print("Enter an integer:  \n");
		int x=Integer.parseInt(br.readLine()); 

		w=w-1;
		a=a+x;
		}System.out.print("The sum is "+a+ "\n");

	}

}
