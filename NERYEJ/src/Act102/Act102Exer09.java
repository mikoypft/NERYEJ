package Act102;
import java.io.*;
public class Act102Exer09{
	public static void main (String[]args) throws IOException{
		int[] signal = {5,5,4,5,6,6,7,6,5,4,1,4};
		int[] smooth = new int[12];
		smooth[0] = (signal[0] + signal[1])/2;
		smooth[signal.length-1] = (signal[10] + signal[11])/2;
		for (int index = 1; index < signal.length-1; index++){
			smooth[index] = (signal[index-1] + signal[index] + signal[index+1])/3;
		}
		System.out.print("signal :");
		for (int j =0; j < smooth.length; j++){
			System.out.print(signal[j]);
		}
		System.out.println();
		System.out.print("smooth :");
		for (int j =0; j < smooth.length; j++){
			System.out.print(smooth[j]);
		}
                System.out.println();
	}
}