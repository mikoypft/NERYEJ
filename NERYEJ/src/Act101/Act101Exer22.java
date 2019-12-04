package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer22 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Exercise 22:Microwave Oven\n");
		System.out.print("Number of Items:\n");
		int x=Integer.parseInt(br.readLine());  
		System.out.print("Single Item Heating Time: \n");
		int y=Integer.parseInt(br.readLine()); 
		int a=0;

		if (x==1){
		   a=y;
		} else if(x==2){
		   a=(y*3)/2;
		} else if(x==3){
		  a=y*2;
		} else{
		System.out.print("That is not recommended!\n");
		}
		System.out.print("Recommended Heating time:  " +a+ "\n");

	}

}
