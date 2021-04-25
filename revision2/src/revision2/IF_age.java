package revision2;
import java.util.Scanner;
public class IF_age {

	public static void main(String[] args) {
		
		Scanner mykey = new Scanner(System.in);
		
		final int MINOR = 18;
		System.out.print("Enter you age: ");
		int age = mykey.nextInt();
		
		if (age<MINOR)
			System.out.println("wonderful!");
		System.out.println("Oh well!");
		
		mykey.close();
		

	}

}
