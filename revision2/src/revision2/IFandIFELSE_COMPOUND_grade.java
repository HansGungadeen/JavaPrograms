package revision2;

import java.util.Scanner;

public class IFandIFELSE_COMPOUND_grade {

	public static void main(String[] args) {
		
		Scanner mykey = new Scanner(System.in);
		
		
		int grade;
		
		System.out.print("what is your grade? ");
		grade = mykey.nextInt();
		
		if(grade >=80)
			System.out.println("congratulations!");
		else
			System.out.println("you could do better");
		System.out.println("make sure you practice");
		
		System.out.println("bye bye");
		
		mykey.close();
	}

}
