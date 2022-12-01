import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int first = in.nextInt();
		System.out.println("Enter a second number");
		int second = in.nextInt();
		
		String output = "";
		
		int number = 0;
		
		for (int i=0;i<=first;i++) {
			
			
			System.out.println(number +"\n");
			number++;
			
			
		}
		
				
		in.close();
	}

}
