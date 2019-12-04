package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer03 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 3:Average Rain Fall\n");
		        
		System.out.print("Rainfall for April:\t");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Rainfall for May:\t");
		int b=Integer.parseInt(br.readLine());
		System.out.print("Rainfall for June:\t");
		int c=Integer.parseInt(br.readLine());
		System.out.print("AverageRain fall:\t");
		double d= (a+b+c)/3;
		System.out.print(+d+ "\n");

	}

}
