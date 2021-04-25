
import java.util.Scanner;

public class ScannerDemo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		

		System.out.println("Enter the number of pods: ");
		int numberOfPods = keyboard.nextInt( );
		
		System.out.println("the number of peas: ");
		int peasPerPod = keyboard.nextInt( );
		
		
		int total= numberOfPods*peasPerPod;
		System.out.print("Total is " + total);
		


	}

}
