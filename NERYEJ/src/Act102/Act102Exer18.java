package Act102;
import java.io.*;

public class Act102Exer18 {
 
  public static void main(String[] args) 
   throws IOException {
    
    int i = 0;
    int num = 0;
    int row;
    int col;
    
    for ( i = 0; i < 8; i++ ) 
      {
      for ( row = 1; row <= 8; row++ ) 
        {
        for ( col = 1; col <= 64; col++ )
          {
            String strNum = Integer.toString(num);
            System.out.printf("%s", strNum);
          }
           System.out.println();
        }
      num += 8;
    }
  }
}
