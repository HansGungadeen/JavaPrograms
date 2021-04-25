package ubuntu2;

import java.util.LinkedList; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DSAGraph87452
{

	int numbb;
	LinkedList<Integer> adj[];
	
	public DSAGraph87452(int numbb)
	{
		this.numbb = numbb;
		adj = new LinkedList[numbb];
		
		for(int n = 0; n<numbb ; n++)
		{
			adj[n] = new LinkedList<>();
		}
	}
	
	public void addX(int start, int end)
	{
		adj[start].add(end);
		adj[end].add(start);
	}
	
	public static void displayG(DSAGraph87452 g)
	{
		for(int s = 0; s<g.numbb; s++)
		{
			 System.out.println("Adjacency list of vertex  "+ s + " is:" ); 
		  System.out.print("head");
		  
		  for(Integer y: g.adj[s])
		{ 
		
		   System.out.print(" → "+ y); 
                } 
                
          System.out.println("\n");
            
		}
	}
	
		
      public static void File()
      {
      	
        FileInputStream fileStrm =null;
        InputStreamReader rdr;
        BufferedReader bufrdr;
        String FileName = "DSAgraph.txt";
  
        try
        {
          fileStrm = new FileInputStream(FileName);
          rdr = new InputStreamReader(fileStrm);
          bufrdr = new BufferedReader(rdr);
          String line;
          line = bufrdr.readLine();
   
        while (line!= null)
        {	               
           num++;	                                       
           line = bufrdr.readLine();
        }
         fileStrm.close();
        }
        
        catch (IOException e)
        {
          System.out.println("File not found " + e.getMessage());
         
        } 
	
	
	
	public static void main(String[] args)
	{
		int numb = 7;
		DSAGraph87452 g = new DSAGraph87452(numb);
	
        
		
		/*File myObj = new File("DSAgraph.txt");
		if (myObj.exist())
		{
			
		}*/
		
		/*
		g.addX(0,1);
		g.addX(0,4);
		g.addX(0,3);
		g.addX(1,4);
		g.addX(2,3);
		g.addX(3,5);
		g.addX(4,5);
		g.addX(4,6); 
		g.addX(5,6); 
		DSAGraph.displayG(g); */
 	
	}
	
	
}
