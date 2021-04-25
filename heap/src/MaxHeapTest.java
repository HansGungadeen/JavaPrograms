/**
 * DSA Final Assessment Question 3 - MaxHeapTest.java
 *
 * Name : 
 * ID   :
 *
 **/
 
public class MaxHeapTest
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("\n**** Question 3: Testing Heaps ****\n");
		
		FA_Heap  testHeap = new FA_Heap();
		
		for (int i=0; i<10; i++)
		{
			testHeap.add(i, i+100);
			System.out.println("Added "+i);
		}
		
		int temp;
		
		for (int i=0; i<10; i++)
		{
			temp = (Integer)testHeap.remove();
			System.out.println(temp);
		}
		System.out.println("\n**** Tests Complete ****\n" );
	}
}