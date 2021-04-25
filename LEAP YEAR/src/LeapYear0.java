import java.util.Scanner;

/**
 * 
 */

/**
 * @author IOT
 *
 */
public class LeapYear0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		
		int year = sc.nextInt();//store value of year
		
		boolean temp = false;//act as a counter
				
		if(year % 400 == 0)// dividing year by 400 
		{
			temp = true;
		}
		else 
			if(year % 100 == 0)// dividing year by 100
		{
			temp = false;
		}
		else 
			if(year % 4 == 0)// dividing year by 4
			{
				temp = true;
			}
			else
			{
				temp = false;
			}
		if (temp)// if value of temp is true then leap year else not 
		{
		System.out.println("Year " + year + " is a Leap Year");
		}
		else
		{
		System.out.println("Year " + year + " is not a Leap Year");
		}
			
			
		

	}

}
