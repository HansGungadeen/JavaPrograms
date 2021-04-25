import java.util.Scanner;

/**
 * 
 */

/**
 * @author IOT
 *
 */
public class LeapYear1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
		int year = sc.nextInt();

        if ((year % 4 == 0) && year % 100 != 0)
        {
            println(year + " is a leap year.");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            println(year + " is a leap year.");
        }
        else
        {
            println(year + " is not a leap year.");
        }

	}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}

}
