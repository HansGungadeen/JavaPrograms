/**
 * 
 */

/**
 * @author IOT
 *
 */
public class StringComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "JAVA isn't just for breakfast.";
		String s2 = "JAVA isn't just for breakfast.";
		
		if (s1.contentEquals(s2))
			System.out.println("The two lines are equal.");
		else
			System.out.println("The two lines are not equal");
		
		if (s2.contentEquals(s1))
			System.out.println("The two lines are equal.");
		else
			System.out.println("The two lines are not equal");
		
		String s3 = "Java isn't just for breakfast.";
		String s4 = "JAVA isn't just for breakfast.";
		
		if (s3.equalsIgnoreCase(s4))
			System.out.println("But the lines are equal, " + "ignore case");
		else
			System.out.println("Lines are not equal, " + "even ignoring case.");
		

	}

}
