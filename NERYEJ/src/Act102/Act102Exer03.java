package Act102;


    public class Act102Exer03 {  
      
      public static void main ( String[] args )  {  
        
        
        int[] valA   = { 13, -22,  82,  17};     
        int[] valB   = {-12,  24, -79, -13};    
        
        int sumAB    = valA.length < valB.length ? valA.length : valB.length;
        int[] sum    = new int[ sumAB ]; 
        
        for (int count = 0; count < sumAB; count++) {
          sum[count] = valA[count] + valB[count];
        
      } System.out.println( "SUM: "         + sum[0] + " " + sum[1] + " " 
                + sum[2] + " " + sum[3] ); 
      }
    }
  
