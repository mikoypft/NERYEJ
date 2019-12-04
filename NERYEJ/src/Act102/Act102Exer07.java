package Act102;
import java.io.*;
public class Act102Exer07{
	public static void main (String[]args) throws IOException{
		int[] data = {3,1,5,7,4,12,-3,8,-2};
		int firstlargestnumber=0;
		int secondlargestnumber=0;
		for (int index = 0; index < data.length; index++){
			if (data[index]>firstlargestnumber){
				firstlargestnumber=data[index];
			}
			if (data[index]<firstlargestnumber && data[index]>secondlargestnumber){
				secondlargestnumber=data[index];	
			}
		}
		System.out.println("The first largest number is : "+firstlargestnumber);
		System.out.println("The second largest number is : "+secondlargestnumber);
	}
}