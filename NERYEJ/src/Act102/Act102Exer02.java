package Act102;
import java.util.*;
import java.io.*;

public class Act102Exer02 {  
  
  public static void main ( String[] args )  
    throws IOException
  {   
    int[] val = {13, -4, 82, 17};     
    int[] twice = new int[val.length];       
    
    System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    
    twice = Arrays.copyOf(val,val.length);


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Press any key");
    boolean proceed = Boolean.parseBoolean(br.readLine());
    
    
    if (proceed = true){
    System.out.println( "New Array: " + twice[0] * 2 + " " + twice[1] * 2 + 
                       " " + twice[2] * 2 + " " + twice[3] * 2 ); 
    } else{
      System.out.println("End"); }
  
  }
}