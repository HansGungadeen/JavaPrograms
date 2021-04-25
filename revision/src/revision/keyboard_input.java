package revision;

import java.util.Scanner;

public class keyboard_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myKeyboard = new Scanner(System.in);
		
		System.out.println("Your name:");
		String name =myKeyboard.next();
		System.out.println("Welcome " + name + " Enter Your Age: ");
		int age= myKeyboard.nextInt();

	}

}
