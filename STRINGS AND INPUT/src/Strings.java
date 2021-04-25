/**
 * 
 */

/**
 * @author IOT
 *
 */
public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = new String ("This is a string ");
		String string2 = "";
		String string3, string4, string5;
		
		System.out.println("\"" + string1 + "\"");
		System.out.println(string1.length());
		System.out.println("\"" + string2 + "\"");
		System.out.println(string2.length());
		
		string2 = string1.concat("hello");
		string3 = string2.toUpperCase();
		string4 = string3.replace('E', 'X');
		string5 = string4.substring(3,10);
		
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
		System.out.println(string5);

	}

}
