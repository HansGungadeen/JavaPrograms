package DSAstack;

import java.util.*;

public class DSAlinkedListTestHarness
{
	public static void main (String[] ags)
	{

		Scanner sc = new Scanner(System.in);

		DSAlinkedList L = new DSAlinkedList();

		int choice ; 
		int put;
		int bypass= 0;
                int looploop = 1;
		System.out.println("Enter 1 : To Test DSAlinkedList .\nEnter 2: To End the program.\nEnter Your Choice:");
		put = sc.nextInt();
		do
		{    
			if (put == 1)
			{
                              do{
                               
				System.out.print("Please kindly enter the first  number in the list: \n");

				int fnum = sc.nextInt();
				L.insertFirst(fnum);

				System.out.println("\nThe first value in the list is : \n" + L.peekFirst());

				System.out.print("\nPlease kindly enter the last number in the list: \n");

				int lnum = sc.nextInt();

				L.insertLast(lnum);

				System.out.println("\nThe last value  in the list is : \n" + L.peekLast());


			
		                System.out.println();
		        
		              System.out.println("\n\nPress: 1 - To get new first value and new last value.\nPress : 2 - To stop .");
		              bypass = sc.nextInt();
		              looploop++;
		          
		           }while(bypass < 2);
		          
		            do{
  

				  System.out.println("\nThe value  that has been removed first is: "+L.removeFirst());

				  System.out.println("\nThe last value has been removed is : "+L.peekLast());
				      
				  

			       }while(looploop > 0);
		
		  }
	         else 
	          {	        
		        System.out.println("End of program.\n Bye!\n GoodDay."); 
		  }

          
          
          
        }while((put < 0) || (put > 2));
	      
     	
   }
 }
 

