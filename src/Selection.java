import java.util.Scanner;
public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int number = in.nextInt();
		double tax = 0;
		double remainder = 0;

		
		if (number <=49020) {
			tax += number * 0.15;
			remainder = number-tax;
		}
		
		else if (remainder >49020 && remainder <98040) {
				tax += remainder * 0.205;
				remainder = number-tax;
			
		}
		

		System.out.println("The amount of tax for $"+number+" is $"+ tax);
		
		in.close();
		
	}

}
