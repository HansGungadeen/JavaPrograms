package revision2;

import java.util.Scanner;

public class IFELSE_wages {

	public static void main(String[] args) {
		
		Scanner mykey = new Scanner(System.in);
		
		final double RATE = 10.0;
		final int STANDARD = 40;
		double pay = 0;
		
		System.out.print("number of hours worked:");
		int hours= mykey.nextInt();
		
		if(hours>STANDARD)
			pay = STANDARD*RATE + (hours-STANDARD) * (RATE*1.5);
		else
			pay = hours * RATE;
		System.out.println("pay: " + pay);
		
		mykey.close();
		
		

	}

}
