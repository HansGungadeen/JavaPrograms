package sanbox;

import java.util.Scanner;

public class Basic_salary {

	public static void main(String[] args) {
		Scanner mykey = new Scanner(System.in);
		System.out.println("Enter Hours worked: ");
		int hours = mykey.nextInt();
		int salary;
		int rate = 50;
		
		if (hours > 40)
		{
			int bonus = ((150/100) * hours);
			salary = (40 * rate) + (bonus * rate);
		}
		else
			salary = hours * rate;
		
		System.out.print("Salary: "+ salary);
			
		
		
		mykey.close();
	}

}
