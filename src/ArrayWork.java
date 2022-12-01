import java.util.Arrays;
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
		
		double max = temp[0];
		
		for (int i=0;i<n;i++) {
			
			if (temp[i]>max) {
				max = temp[i];
			}
		
		}
		
		double min = temp[0];
		
		for (int i=0;i<n;i++) {
			if (temp[i] < min) {
				min = temp[i];
				
			}
		
		}
		
		double average = 0;
		double sum = 0;
		
		for (int i=0;i<n;i++) {
			sum+=temp[i];
		}
		
		average = sum/n;
		
		double a = 0;
		
		for(int i=0; i <n; i++) {
			for (int j=0; j<n-1; j++) {
				if (temp[j] > temp[j+1]) {
					a = temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=a;
				}
			}
		}
		
		
		System.out.println("The maximum is: "+max);
		System.out.println("The minimum is: "+min);
		System.out.println("The average is: "+average);
		
		System.out.println("Your sorted array is: "+Arrays.toString(temp));

		
		in.close();
		
	}

}
