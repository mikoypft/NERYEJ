package Act102;
 import java.io.* ;
public class Act102Exer06 {

public static void main ( String[] args ) throws IOException  {   
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};  
    int sum1=0,sum2=0,sum3=0;
      
    for (int i = 0; i < data.length; i++){
        
          if (data[i] % 2 == 0) 
                sum2 = sum2+ data[i]; 
          else
                sum3 = sum3+ data[i]; 
      }sum1 = sum2+sum3;
      System.out.println("Sum of array elements is:"+ sum1 );
      System.out.println("Sum of even elements is:"+sum2);
      System.out.println("Sum of odd elements is:"+sum3);
     
}}
