/**
 * DSA Final Assessment Question 5 - GraphTest.java
 *
 * Name : 
 * ID   :
 *
 **/

public class FA_GraphTest
{
	public static void main(String args[]) throws Exception
	{
			System.out.println("\n**** Question 5: Testing Graphs ****\n");
			// put your code here
						
			FA_Graph g = new FA_Graph();
			
			g.addVertex("one", 1);
			g.addVertex("two", 2);
			g.addVertex("three", 3);
			g.addVertex("four", 4);
			
			g.addEdge("one", "two");
			g.addEdge("one", "three");
			g.addEdge("one", "four");
			g.addEdge("four", "two");
			g.addEdge("four", "three");
			
			
			g.displayAsList();
			g.displayAsMatrix();
			
			
			System.out.println("\n**** Tests Complete ****\n");

	}
	
}