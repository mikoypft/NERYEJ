package Act102;
import java.io.*;

public class Act102Exer14{
	public static void main (String[]args) throws IOException{
		int[][] data = { {3, 2, 5},
                               {1, 4, 4, 8, 13},
                               {9, 1, 0, 2},
                               {0, 2, 6, 3, -1, -8}}; 
                 
    
        System.out.println(getMaxValue(data));
        System.out.println(getMinValue(data));
    }


    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        System.out.print("Maximum value: ");
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue ) {
                    minValue = numbers[j][i];
                }
            }
        }
        System.out.print("Minimum value: " );
        return minValue;
    }
}