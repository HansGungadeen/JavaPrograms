package revision;

import java.util.Scanner;

public class Scannerdemo2 {

	public static void main(String[] args) {
		
		//read integer
		//declare 2 variable
		int n1,n2;
		//declare scanner object
		Scanner keyIn = new Scanner(System.in);
		
		//read two whole number
		System.out.println("Enter two whole number");
		System.out.println("seperated bt one or more spaces: ");
		
		//read 1 int and assign to n1
		n1 = keyIn.nextInt();
		
		//read 2nd int and assign to n2
		n2 = keyIn.nextInt();
		
		System.out.println("You entered " + n1 + " and "  + n2);
		System.out.println("Next enter two numbers with a "  + " decimal point.");
		System.out.println("Decimal points are allowed.");
		
		//read double
		double d1,d2;
		d1 = keyIn.nextDouble();
		d2 = keyIn.nextDouble();
		System.out.println("You entered " + d1+ " and " + d2);
		
		//close the scanenr
		keyIn.close();
		

	}

}
