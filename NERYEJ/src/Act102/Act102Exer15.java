package Act102;
import java.io.*;

public class Act102Exer15{
	public static void main (String[]args) throws IOException{
		int[][] data = { {3, 2, 5},
                               {1, 4, 4, 8, 13},
                               {9, 1, 0, 2},
                               {0, 2, 6, 3, -1, -8}}; 
                
        
    maxelement(4, data); 
    } 
  public static void maxelement(int no_of_rows, int[][] data) { 
        int i = 0; 
        
        int max = 0; 
        int[] result = new int[no_of_rows]; 
        while (i < no_of_rows) { 
            for (int j = 0; j < data[i].length; j++) { 
                if (data[i][j] > max) { 
                    max = data[i][j]; 
                } 
            } 
            result[i] = max; 
            max =0; 
            i++; 
  
        } 
        for ( i =0; i<result.length;i++) { 
            System.out.println("Largest element in row "+i+ ": " +result[i]); 
        } 
  
    } 
  
           
    
} 