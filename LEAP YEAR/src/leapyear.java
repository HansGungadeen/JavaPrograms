import java.util.Scanner;

/**
 * 
 */

/**
 * @author IOT
 *
 */
public class leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.print("Please enter any year : ");
	      int year = sc.nextInt();
	      boolean temp = false;
	      if(year % 400 == 0)
	      {
	         temp = true;
	      }
	      else if(year % 100 == 0)
	      {
	         temp = false;
	      }
	      else if(year % 4 == 0)
	      {
	         temp = true;
	      }
	      else
	      {
	         temp = false;
	      }
	      if(temp)
	      {
	         System.out.println("Year " + year + " is a Leap Year");
	      }
	      else
	      {
	         System.out.println("Year " + year + " is not a Leap Year");
	      }
		{
			
	
		}
			

	}

}
