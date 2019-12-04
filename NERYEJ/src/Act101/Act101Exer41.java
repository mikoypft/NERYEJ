package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer41 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.print ("Exercise 41:Area of Rectangles\n");
		double firstcornerX, firstcornerY, secondcornerX, secondcornerY;
		 
		System.out.print ("First corner X coordinate: ");
		firstcornerX =Double.parseDouble(br.readLine());
		while (!( firstcornerX ==0))
		{
		System.out.print ("First corner Y coordinate: ");
		firstcornerY =Double.parseDouble(br.readLine());
		System.out.print ("Second corner X coordinate: ");
		secondcornerX =Double.parseDouble(br.readLine());
		System.out.print ("Second corner Y coordinate: ");
		secondcornerY =Double.parseDouble(br.readLine());

		double w= Math.abs(firstcornerX-secondcornerX);
		double h= Math.abs(firstcornerY-secondcornerY);
		System.out.println ("Width: " + w + " Height: " + h + " Area: " + (w * h));
		System.out.println (); 
		System.out.print ("Enter first corner X: ");
		firstcornerX =Double.parseDouble(br.readLine());

		}

	}

}
