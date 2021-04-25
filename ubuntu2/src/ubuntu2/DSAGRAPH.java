package ubuntu2;

import java.util.LinkedList;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DSAGRAPH 
{
	int numbb;
	LinkedList<Integer> adj[];
	
	public DSAGRAPH(int numbb)
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
	
	public static void displayG(DSAGRAPH g)
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
	
	public static <Inventory> void main(String[] args)
	{
		List<Inventory> invItem  = new ArrayList<>();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("DSAgraph.txt"));
			String fileRead = br.readLine();
			
			while (fileRead != null)
			{
				String[] tokenize = fileRead.split(",");
				
				String tempItem = tokenize[0];
				int tempQty = Integer.parseInt(tokenize[1]);
				float tempPrice = Float.parseFloat(tokenize[2]);
				
				Inventory tempObj = new Inventory(tempItem, tempQty, tempPrice);
				
				invItem.add(tempObj);
				fileRead = br.readLine();
			}
			
			br.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		for (Inventory each : invItem)
		{
			System.out.println("====================");
			System.out.println(each);
			System.out.println();
		}
		
	}
}
    /*  
	public static void main(String[] args) throws FileNotFoundException 
	{
		ArrayList<String> dataa = new ArrayList<String>();
		ArrayList<Integer> data = readFiles("DSAgraph.txt");
		
		//int[] data = readFiles("DSAgraph.txt");
		System.out.println(data);
	}
	
	private static ArrayList<Integer> readFiles(ArrayList<Integer> file) throws FileNotFoundException 
	{
		//create file object
		File f = new File(file);
		//scanner object
		Scanner s = new Scanner(f);
		
		int ctr = 0;
		//count the number of item in one line
		while (s.hasNextInt())
		{
			ctr++;
			s.nextInt();
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>(ctr);
		//create a new scanner as scanner location is not the same
		Scanner s1 = new Scanner(f);
		//place int to arraylist
		for (int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.size());
		}			
			//arr[i] = s1.nextInt();
		
		return arr;
		/*
		try
		{
			
		}
		catch(Exception e)
		{
			return null;
		}
		*/

