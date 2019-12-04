package Act102;

public class Act102Exer01 { 
  
  public static void main ( String[] args )  

  {     
    int[] val = {0, 1, 2 ,3};
    int sum = 0;
    
    for (int count : val)
      sum += count;
    
    System.out.println( "Sum of all numbers = " + sum );
 
   } 
}
