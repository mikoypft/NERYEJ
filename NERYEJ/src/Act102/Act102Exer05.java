package Act102;
import java.util.*;


 public class Act102Exer05 
 { static void reverse(Integer temp[]) 
   {Collections.reverse(Arrays.asList(temp));
   }
   public static void main ( String[] args ) 
     {   
       Integer [] val = {0, 1, 2, 3};  

  System.out.println( "Original Array: [" + val[0] + " " + val[1] + " " + val[2] 
                     + " " + val[3] + "] " ); 
      reverse (val);
 
    System.out.println( "Reversed Array: [" + val[0] + " " + val[1] + " " 
                        + val[2] + " " + val[3] + "] " ); 
  } 
}