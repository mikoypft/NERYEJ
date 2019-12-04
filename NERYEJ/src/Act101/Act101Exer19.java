package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer19 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 19:Y2K Problem Detector\n");
		System.out.print("Year of Birth:\n");
		int w=Integer.parseInt(br.readLine());
		System.out.print("Current year:\n");
		int x=Integer.parseInt(br.readLine());

		int a= (x+2000)-(w+1900);
		int b= 0;
		if (a>100){
		     b = a-100;
		}else b=a;
		{
		    
		}
		System.out.print("Your age:\n" + b + "\n");

	}

}
