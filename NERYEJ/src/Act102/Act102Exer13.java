package Act102;
import java.io.*;

public class Act102Exer13{
 public static void main ( String[] args ) throws IOException
 {  int[][] data = {{3, 2, 5, 0, 0, 0}, 
                   {1, 4, 4, 8, 13, 0}, 
                   {9, 1, 0, 2, 0, 0}, 
                   {0, 2, 6, 3, -1, -8}}; 
   
 int sum = 0,row = 0,col = 0;
for ( row = 0; row < data.length + 2; row++ )
 { 
   for ( col = 0; col < data.length; col++)
   {
     sum = sum + data[col][row];
   }
   
 System.out.println("Sum of the column " + row + " = " + sum);
 
 }}}
