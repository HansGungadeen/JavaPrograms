
import java.util.*;
public class Name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Your Name: ");
		String Name = keyboard.next();
		
		System.out.println("Your Age: ");
		int Age = keyboard.nextInt();
		
		System.out.println("Welcome " + Name);
		System.out.println("Your Age is " + Age);
		
		
	}

}
