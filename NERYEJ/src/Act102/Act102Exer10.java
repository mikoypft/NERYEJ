package Act102;
import java.io.*;
public class Act102Exer10{
	public static void main (String[]args) throws IOException{
		double[] pH =new double[13];
		System.out.println(13);
                pH[0]=5.6;
                pH[1]=6.2;
                pH[2]=6.0;
                pH[3]=5.5;
                pH[4]=5.7;
                pH[5]=6.1;
                pH[6]=7.4;
                pH[7]=5.5;
                pH[8]=5.5;
                pH[9]=6.3;
                pH[10]=6.4;
                pH[11]=4.0;
                pH[12]=6.9;
      double sum=0,ave=0,nave=0;          
      for (int i = 0; i < pH.length; i++){
        
            sum = sum + pH[i];
            ave=sum/13;
            nave=(sum-pH[11])/13;
      }
      for (int j =0; j < pH.length; j++){
	     System.out.println(pH[j]);       
} System.out.println("Average: " +ave);
  System.out.println("Most distant value: " +pH[11]);
  System.out.println("New Average: " +nave);
}     
}