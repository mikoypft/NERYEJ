package Act101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Act101Exer42 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		System.out.println("Exercise 42:Credit Card Bill\n");
		double payment, debt;
		int month;

		System.out.println("Please enter the monthly payment: ");
		payment =Double.parseDouble(br.readLine());
		month = 0;
		 
		debt = 1000;
		 
		System.out.println("Month: " + month + "Balance: $" + debt + 
		        "    Total payed: $" + "0.000");
		 
		while (debt > payment) {
		debt = debt * 1.015;
		debt = debt - payment;
		System.out.println("Month: " + (month = month + 1) + "   Balance: $" + debt +
		        " Total payed: $" + (payment * month));}
		System.out.println("Month: " + (month = month + 1) + "   Balance: $0.0" + 
		        " Total payed: $" + (payment * month - debt));

	}

}
