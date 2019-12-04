package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer36 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 36:Wedge of Stars\n" );
		System.out.print("Initial number of stars:" );
		int N=Integer.parseInt(br.readLine());

		while(N > 0) {
		      for(byte i = 1; i <= N; i++) {
		        System.out.print("*");
		      }
		      System.out.print("\n");
		      N--;


		}

	}

}
