package Act102;
import java.io.*;

public class Act102Exer12{
 public static void main ( String[] args ) throws IOException
 { int[][] data = {{3, 2, 5}, 
                  {1, 4, 4, 8, 13}, 
                  {9, 1, 0, 2}, 
                  {0, 2, 6, 3, -1, -8}}; 
   
 int sum = 0,row = 0,col = 0;

 
 for ( row = 0; row < data.length; row++)
 { 
   for ( col = 0; col < data[row].length; col++)
   {
     sum = sum + data[row][col];
   }
   
 System.out.println("Sum of the row " + row + " = " + sum);
 
}}}

