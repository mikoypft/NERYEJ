package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer29 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 29\n");
		System.out.print("Enter a word:  \n");
		String w=br.readLine(); 
		int times;
		times = w.length();
		for(int i=0;i<times;i++){
		    System.out.println(w);
		}

	}

}
