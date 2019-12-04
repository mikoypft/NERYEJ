package Act102;
 import java.io.* ;
public class Act102Exer08 {

public static void main ( String[] args ) throws IOException  {   
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};   
  System.out.print("Array :");
for (int h =0; h < data.length; h++){
System.out.print(data[h]+"  ");}
  System.out.println();
  for(int i=0; i<data.length/2; i++){
  int temp = data[i];
  data[i] = data[data.length -i -1];
  data[data.length -i -1] = temp;}
System.out.print("Reversed Array: " );

 for ( int j=0; j < data.length; j++)    {
      System.out.print(data[j]+ "  ");
    } System.out.println();
}     
   }

