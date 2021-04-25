/**
 * DSA Final Assessment Question 2 - GraphTest.java
 *
 * Name : Troubadour Fabrice Alexandre
 * ID   : 19991834
 *
 **/
public class GraphTest
{
	public static void main(String args[])
	{
			// put your code here
			DSAGraph g = new DSAGraph();

			g.addVertex("one", 1);
			g.addVertex("two", 2);
			g.addVertex("three", 3);
			g.addVertex("four", 4);

			g.addEdge("one", "three");
			g.addEdge("one", "four");
			g.addEdge("four", "two");
			g.addEdge("four", "three");

			g.displayAsList();
			g.displayAsMatrix();
	}

}
