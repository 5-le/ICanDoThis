import java.util.Scanner;
public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Pick an array size");
		int size = in.nextInt();
		
		double[] temp = new double [size];
		
		System.out.println("Pick the doubles");
		int n = temp.length;
		int b = 0;
		
		for (int i=0;i<n;i++) {
				double a = in.nextDouble();
				temp[b]=a;
				b++;	
		}
		
		double max = 0;
		
		for (int i=0;i<n-1;i++) {
			
			if (temp[i]>=temp[i+1]) {
				max = temp[i];
			}
			else {
				max = temp[i+1];
			}
		}
		
		double min = 0;
		
		for (int i=0;i<n-1;i++) {
			
			if (temp[i]<=temp[i+1]) {
				min = temp[i];
			}
			else {
				min = temp[i+1];
			}
		}
		
		double average = 0;
		
		for (int i=0;i<n-1;i++) {
			average = temp[i]+temp[i+1];
			
		}
		
		
		
		System.out.println("The maximum is: "+max);
		System.out.println("The minimum is: "+min);
		System.out.println("The average is: "+average);

		
		in.close();
		
	}

}
