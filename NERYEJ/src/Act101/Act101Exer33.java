package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer33 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 33\n");
		System.out.print("Enter N :  \n");
		float N=Float.parseFloat(br.readLine());  

		float a=0;
		float b=0;
		for(int i=0; i<N; i++){
		System.out.print("Enter number :  \n");
		float x=Float.parseFloat(br.readLine());

		b=b+x;
		a=a+(x*x);

		}
		float avg= b/N;  
		float avg2= avg*avg;
		float avgsqr= a/N;
		double sd= Math.sqrt(avgsqr-avg2);

		System.out.print("avg= " +avg+ "\n");
		System.out.print("avg^2=" +avg2+ "\n");
		System.out.print("avgSquare=" +avgsqr+ "\n");
		System.out.print("Standard Deviation= " +sd+ "\n");

	}

}
