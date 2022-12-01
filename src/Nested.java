import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int first = in.nextInt();
		System.out.println("Enter a second number");
		int second = in.nextInt();
		
		System.out.print("x" + "\t");
		
		for (int i=first;i<=second;i++) {
			
			System.out.print(i+"\t");	
			
			}
		for (int j = first; j<=second;j++) {
			System.out.print("\n"+j);
			for (int k = first; k <=second;k++) {
			System.out.print("\t"+j*k);
			}
			
		}	
				
		in.close();
	}

}
