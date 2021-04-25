import java.util.*;

/**
 * 
 */

/**
 * @author IOT
 *
 */
public class Fahrenheinttocelcius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare varaibles
		double farenheint,celcius;
		
		Scanner keyboard = new Scanner(System.in);
		
		//enter temperature
		System.out.print("Please Enter temperature in Farenheint: ");
		farenheint = keyboard.nextDouble();
		
		//convert
		celcius = (farenheint - 32) * 5/9;
		System.out.println("Celcius = " + celcius);
		
		
		
		
		

	}

}
