import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int first = in.nextInt();

		int number = first;
		
		number = number -1;
		number = number *3;
		number = number + 12;
		number = number/3;
		number = number +5;
		number = number - first;
		
		System.out.println("Your result is: "+number);
		
		
		in.close();
	}

	
}
