/**
 * DSA Final Assessment Question 4 - FA_HashTest.java
 *
 * Name : 
 * ID   :
 *
 **/

public class FA_HashTest
{
	public static void main(String args[])
	{
		System.out.println("\n**** Question 4: Testing Hash Tables ****\n");

		FA_HashTable tab = new FA_HashTable(20);

		String[] data = {"11111112", "11111121", "11111211", "11112111", "11121111", "11211111", "12111111", "21111111"};

        for (int i=0; i < data.length; i++)
		{
			tab.put(data[i], "O"+data[i]);
		}		

		System.out.println("Table size is: " + tab.getArrayLength() );
		
		tab.display();
		
		System.out.println("Load Factor is: " + tab.getLoadFactor() );
		
		System.out.println("\n**** Tests Complete ****\n");
	}
}