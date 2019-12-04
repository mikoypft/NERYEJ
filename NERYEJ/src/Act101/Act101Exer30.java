package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer30 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 30\n");
		System.out.print("Enter the first word:  \n");
		String w=br.readLine(); 
		System.out.print("Enter the second word:  \n");
		String x=br.readLine(); 

		int times =30-w.length();
		System.out.print(w);
		for(int i=0;i<times ;i++){
		 
		    System.out.print(".");
		}
		System.out.print(x+ "\n");

	}

}
