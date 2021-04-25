/**
 * 
 */

/**
 * @author IOT
 *
 */
public class Stringcomparison2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java isn't just for breakfast.";
		String s2 = "JAVA isn't just for breakfast.";
		
		if (s1.equalsIgnoreCase(s2))
			System.out.println("But the lines are equal, " + "ignore case");
		else
			System.out.println("Lines are not equal, " + "even ignoring case.");
		

	}

}
