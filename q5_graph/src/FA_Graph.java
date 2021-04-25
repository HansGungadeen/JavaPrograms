/**
 * DSA Final Assessment Question 5 - FA_Graph.java                             4
 *
 * Name : 
 * ID   :
 *
 **/
import java.util.*;
import java.io.*;

public class FA_Graph 
{
    private FA_LinkedList vertices;
    private int vertexCount;
    private int edgeCount;
    
    private boolean adjMatrix[][];
    private int numVertices;

    public FA_Graph() 
    {
        vertices = new FA_LinkedList();
        vertexCount = 0;
        edgeCount = 0;
        
    }

    public void addVertex(String label, Object value) 
    {
        FA_GraphVertex vertex = new FA_GraphVertex(label, value); 
        if (!(hasVertex(label))) 
        {
            vertices.insertLast(vertex);
            vertexCount++;
        }
    }

    public void addEdge(String label1, String label2)
    {
        FA_GraphVertex v1, v2; 
        
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
		   FA_GraphVertex vg = (FA_GraphVertex) v;
           if (vg.getLabel().equals(label))
			   has = true;
        }
        return has;
    }

    public FA_GraphVertex getVertex(String label) 
    {
        FA_GraphVertex theVertex = null;
        for (Object v : vertices) 
        {
		   FA_GraphVertex vg = (FA_GraphVertex) v;
           if (vg.getLabel().equals(label))
			   theVertex = vg;
        }
		return theVertex;    
	}
    

    public void displayAsList() 
    {
		System.out.println("Adjacency List display");
		// put your code here
		
		FA_ListNode mainNode = vertices.getHead(); //The main node

	      for (int i = 0; i < vertexCount; i++)
	      {
	    	FA_GraphVertex mainVertex = (FA_GraphVertex)mainNode.getValue(); //Main vertex, typecasting Object to GraphVertex
	        System.out.print(mainVertex.getValue() + " : ");
	        FA_LinkedList links = mainVertex.getLinks();
	        FA_ListNode currNode = links.getHead(); //First node from the links

	        for (int j = 0; j < links.getSize(); j++)
	        {
	        	FA_GraphVertex currVertex = (FA_GraphVertex)currNode.getValue(); //Get vertex of currNode, typecasting Object to GraphVertex
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
    	
    	if (vertexCount !=0)
    	{
    		FA_GraphVertex[] allVertex = getVertexArray();
    		FA_ListNode node;
    		FA_GraphVertex vertex;
    		FA_LinkedList links;
    		
    		System.out.print(" ");
    		for (int i = 0; i < vertexCount - 1; i++)
    		{
    			System.out.print("+++");
    		}
    		
    		node = vertices.getHead();
    		
    		for (int i = 0; i < vertexCount;i++)
    		{
    			vertex = (FA_GraphVertex)node.getValue();
    			links = vertex.getLinks();
    	        System.out.print("\n" + allVertex[i].getValue() + " | ");
    	        FA_ListNode currNode = links.getHead();
    	        FA_GraphVertex currVertex = null;
    	        
    	        if (currNode != null)
    	        {
    	        	for (int j = 0; j < vertexCount; j++)
    	        	{
    	        		if (currNode != null)
    	        		{
    	        			currVertex = (FA_GraphVertex)currNode.getValue();
    	        			
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
    
    private FA_GraphVertex[] getVertexArray()
    {
    	FA_GraphVertex[] vertex = new FA_GraphVertex[vertexCount];
    	FA_ListNode currNode = vertices.getHead();
    	for (int i = 0; i < vertexCount; i++)
    	{
    		vertex[i] = (FA_GraphVertex)(currNode.getValue());
    		currNode = currNode.getNext();
    	}
    	return vertex;
    }
    
    public void displayWeightMatrix()
    {
    	
    }

}  
