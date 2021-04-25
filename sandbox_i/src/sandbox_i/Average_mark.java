/**
 * 
 */
package sandbox_i;

import java.util.Scanner;

public class Average_mark 
{
    static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) 
	{
		int i;
		 
	    System.out.println("Enter number of Students");
	    Scanner sc=new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    
	    int[] a=new int[n];
	 
	    double avg=0;
	    
	    System.out.println("Enter marks");
	    
	    for( i=0;i<n;i++)
	    {
	       a[i]=sc.nextInt();
	    }
	 
	    for( i=0;i<n;i++)
	    {
	      avg=avg+a[i];
	    }
	    
	    System.out.print("Average of (");
	 
	    for(i=0;i<n-1;i++)
	    {
	      System.out.print(a[i]+",");
	    }
	    System.out.println(a[i]+") ="+avg/n);
	}
	}
		
	
}
		

/*		
		//double n1 = 5;
		//double n2 = 10;
		System.out.print("Enter Number of Student: ");
		int a = sc.nextInt();	
		double[] student = new double[a];
		//double[] mark = new double[a];
		
		
		for(int i = 1; i < 5; i++)
		{			
			System.out.print("Enter Mark n"+ i + ": ");
			double m = sc.nextDouble();
			
			double mark[i] = m ;
		
			System.out.print(m);
			
		}
	}
		
		//double average_mark = 0;
		/*
		double a = Sum(n1 , n2);
		double b = average(n1,n2,a);
		//System.out.print(b);
		
		if( n2>b )
		{
			System.out.print(n2);		
		}
		
		if(n1 > b)
		{
			System.out.print(n1);
		}
	}
	
	public static double Sum(double a , double b)
	{
		 double sum= 0.0;
		 sum = a + b;
		 return sum;		
		 
	}
	
	public static double average(double p , double q, double Sum)
	{
		 double average = 0.0;
		 Sum(p , q);		 
		 average = ( Sum / 2);
		 return average;			
	}
*/
}

*/