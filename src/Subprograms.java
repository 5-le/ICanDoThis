import java.util.Scanner;
public class Subprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter a line");
		String one = in.nextLine();
		
		System.out.println("Enter another line");
		String two = in.nextLine();
		
		int n = one.length();
		int o = two.length();
				
		for (int i=0;i<n && i<o;i++) {
			System.out.print(one.charAt(i));
			System.out.print(two.charAt(i));
		
		}
		
		in.close();
		
	}

}
