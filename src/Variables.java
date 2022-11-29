import java.util.Scanner;
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int one = in.nextInt();
		
		System.out.println("Enter a double");
		double two = in.nextDouble();
		
		System.out.println("Enter a string");
		String three = in.nextLine();
		
		in.close();
	}

}
