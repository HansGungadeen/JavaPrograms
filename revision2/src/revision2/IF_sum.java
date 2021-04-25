package revision2;

import java.util.Scanner;

public class IF_sum {

	public static void main(String[] args) {
		
		Scanner mykey = new Scanner(System.in);
		
		System.out.print("Enter the sum: ");
		int sum = mykey.nextInt();
		int delta=0;
		
		if(sum>=100)
			delta = 5;
		
		System.out.println("Delta is " + delta);
		
		mykey.close();
	}

}
