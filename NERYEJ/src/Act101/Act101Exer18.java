package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer18 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 18:Ground Beef Value Calculator\n");
		System.out.print("Input price per pound of package A:\n");
		double w=Double.parseDouble(br.readLine());
		System.out.print("Input the percent lean in package A:\n");
		double x=Double.parseDouble(br.readLine());
		System.out.print("Input the price per pound of package B:\n");
		double y=Double.parseDouble(br.readLine());
		System.out.print("Input the percent lean in package B:\n");
		double z=Double.parseDouble(br.readLine());

		double a= (w/x)*100;
		System.out.print("Package A cost per pound of lean:\n" +a);
		double b= (y/z)*100;
		System.out.print("\nPackage B cost per pound of lean:\n" +b);

		if (a<b){
		System.out.print("\nPackage A is the best value\n");
		} else if (b<a){
		System.out.print("\nPackage B is the best value\n");
		}

	}

}
