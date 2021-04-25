/**
 * DSA Final Assessment Question 2 - DSAGraph.java                             4
 *
 * Name : Troubadour Fabrice Alexandre
 * ID   : 19991834
 *
 **/
import java.util.*;

public class DSAGraph
{
    private DSALinkedList vertices;
    private int vertexCount;
    private int edgeCount;

    public DSAGraph()
    {
        vertices = new DSALinkedList();
        vertexCount = 0;
        edgeCount = 0;
    }

    public void addVertex(String label, Object value)
    {
        GraphVertex vertex = new GraphVertex(label, value);
        if (!(hasVertex(label)))
        {
            vertices.insertLast(vertex);
            vertexCount++;
        }
    }

    public void addEdge(String label1, String label2)
    {
        GraphVertex v1, v2;

        v1 = getVertex(label1);
        v2 = getVertex(label2);

        v1.addEdge(v2);

        edgeCount++;
    }

    public boolean hasVertex(String label)
    {
        boolean has = false;
        for (Object v : vertices)
        {
		   GraphVertex vg = (GraphVertex) v;
           if (vg.getLabel().equals(label))
			   has = true;
        }
        return has;
    }

    public GraphVertex getVertex(String label)
    {
        GraphVertex theVertex = null;
        for (Object v : vertices)
        {
		   GraphVertex vg = (GraphVertex) v;
           if (vg.getLabel().equals(label))
			   theVertex = vg;
        }
		return theVertex;
	  }

    public void displayAsList()
    {
	    System.out.println("Adjacency List display");
      ListNode mainNode = vertices.getHead(); //The main node

      for (int i = 0; i < vertexCount; i++)
      {
        GraphVertex mainVertex = (GraphVertex)mainNode.getValue(); //Main vertex, typecasting Object to GraphVertex
        System.out.print(mainVertex.getValue() + " : ");
        DSALinkedList links = mainVertex.getLinks();
        ListNode currNode = links.getHead(); //First node from the links

        for (int j = 0; j < links.getSize(); j++)
        {
          GraphVertex currVertex = (GraphVertex)currNode.getValue(); //Get vertex of currNode, typecasting Object to GraphVertex
          System.out.print(currVertex.getValue() + " ");
          currNode = currNode.getNext();
        }
        mainNode = mainNode.getNext();
        System.out.print("\n");
      }
    }

    public void displayAsMatrix()
    {
      System.out.println("\nMatrix diplay");

      if (vertexCount != 0)
      {
        GraphVertex[] allVertex = getVertexArray(); //get the values of all the vertices
        ListNode node; //Retrieve current node to retrieve vertex
        GraphVertex vertex; //Retrieve vertex to diplay and retrieve the LinkedList of links
        DSALinkedList links;

        System.out.print("   ");
        for (int i = 0; i < vertexCount; i++)
        {
          System.out.print(" " + allVertex[i].getValue() + " ");
        }
        System.out.print("\n+++++");

        for (int i = 0; i < vertexCount - 1; i++)
        {
          System.out.print("+++");
        }

        node = vertices.getHead();;

        for (int i = 0; i < vertexCount; i++)
        {
          vertex = (GraphVertex)node.getValue();
          links = vertex.getLinks();
          System.out.print("\n" + allVertex[i].getValue() + " | ");
          ListNode currNode = links.getHead();
          GraphVertex currVertex = null;

          if (currNode != null)
          {
            for (int j = 0; j < vertexCount; j++)
            {
              if (currNode != null)
              {
                currVertex = (GraphVertex)currNode.getValue();

                if (currVertex.getValue() == allVertex[j].getValue())
                {
                  System.out.print("1  ");
                  currNode = currNode.getNext();
                }
                else
                {
                  System.out.print("0  ");
                }
              }
              else
              {
                System.out.print("0  ");
              }
            }
          }
          else
          {
            for (int k = 0; k < vertexCount; k++)
            System.out.print("0  ");
          }
          node = node.getNext();
        }
      }
      System.out.print("\n");
    }

    private GraphVertex[] getVertexArray()
    {
      GraphVertex[] vertex = new GraphVertex[vertexCount];
      ListNode currNode = vertices.getHead();
      for (int i = 0; i < vertexCount; i++)
      {
        vertex[i] = (GraphVertex)(currNode.getValue());
        currNode = currNode.getNext();
      }
      return vertex;
    }
}
