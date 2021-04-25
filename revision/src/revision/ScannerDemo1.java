package revision;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		//declare scanner
		Scanner keyboard = new Scanner(System.in);
		
		//ask input
		System.out.println("Enter the number of pods followed by ");
		System.out.println("the number of peas in a pod: ");
		//read input
		int numberOfpods =keyboard.nextInt();
		int peasperpod = keyboard.nextInt();
		int totalNumbersOfPeas = numberOfpods*peasperpod;
		//display output
		System.out.print(numberOfpods + " pods and ");
		System.out.println(peasperpod + " peas per pod.");
		System.out.println("The total number of peas = " + totalNumbersOfPeas);
		
		//close the scanner
		keyboard.close();
		
	}

}
