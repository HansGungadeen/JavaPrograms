package DSAstack;

import java.util.*;

public class StackTestHarness
{
 
    public static void main(String [] args)
    {
	  
         Scanner sc = new Scanner(System.in);
  
          int maxCap;
          int choice;
  
        System.out.println("Enter 1 : To Test DSAstack.\nEnter 2 : To End the program.\nEnter Your Choice:");
        choice = sc.nextInt();
	  do
          {    
		  
	      if (choice == 1)
	      {
	       
	       do
	       {      
		 System.out.println("\nPlease input the maxCapacity of the stack: ");
		 maxCap = sc.nextInt();
		 System.out.println();
	       }  
	       while(maxCap <= 0);
	      
	       
	     // USING LINKED LIST
		 DSAlinkedList stacK = new DSAlinkedList();
		
	    // This for loop will loop to insert the values on top of the stack until the required maxCapacity
	      for(int i = 0; i < maxCap; i++)
	     {
	       int val; 
	       System.out.println("\nPlease input the values to insert on the top stack: ");
	       val = sc.nextInt();                                    
	       stacK.push(val);
	     } 
	    
	   // This FOR LOOP ,will loop until values in the stack have been displayed using the LIFO strategy
	    for(int j = 0; j < maxCap; j++)
	    {   
					       
	    int Counter;      
	    Object a = stacK.pop();
	    Counter = stacK.getCounter() + 1; 
	       
	    //A stack uses LAST IN FIRST OUT (LIFO) strategy to output its values.                    
	    System.out.println("The Value that is on the position "  +  Counter  + " on the Stack is: " + a);
	   
	    }
	   System.out.println("\nA stack uses LIFO strategy to display its values.");
	   }
	   else
	   {
	       System.out.println("End of program.\n Bye!\n GoodDay.");
	   } //end of if statement
	   
        }while(choice <= 0); //end of while loop

	       
  }
		   
}        
		   
