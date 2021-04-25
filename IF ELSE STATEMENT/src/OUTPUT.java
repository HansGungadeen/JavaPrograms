import java.util.Scanner;

/**
 * 
 */

/**
 * @author IOT
 *
 */
public class OUTPUT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("what is your grade? ");
		grade = keyboard.nextInt();
		
		if(grade>=80)
			System.out.println("congratulation!");
		else
			System.out.println("you could do better");
		System.out.println("make sure you practice");
		
		System.out.println("bye bye");
		

	}

}
