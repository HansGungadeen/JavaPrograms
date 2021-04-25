package DSAq;

import java.util.*;

public class DSAqueueTestHarness
{
 
    public static void main(String [] args)
    {
	  
         Scanner sc = new Scanner(System.in);
  
          int numSize;
          int choice;
          String ans;
          int Counter;
          Object out;
          
        System.out.println("Enter 1 : To Test Shuffling Queue .\nEnter 2 : To Test Circular Queue .\nEnter 3 : To End the program.\nEnter Your Choice:");
        choice = sc.nextInt();
	  do
          {    
		  
	      if (choice == 1)
	      {
	         //implement shuffling queue
	       
	       do
	       {      
		   System.out.println("Enter the numSize of the Queue: ");
                   numSize = sc.nextInt();   
		   System.out.println();
	       }  
	       while(numSize <= 0);
	      
	       
	       //using an array                            
	       DSAshufflingqueue q = new DSAshufflingqueue(numSize);                          
		
	    // This for loop will loop to insert the value in the queue 
	      for(int i = 0; i < numSize; i++)
              {
                  
                  System.out.println("Please input a value in the Queue: \n");
                  ans = sc.nextLine();    
                  q.enQueue(ans); // add element in the queue
               }
  
	      System.out.println(); 
	   // This FOR LOOP ,will loop until values in the queue have been displayed using the FIFO strategy
	    for(int j = 0; j < numSize; j++)
            {
                
         
               Counter = q.getCounter();
              //remove element from the queue  
               out =  q.deQueue();                                                     
               System.out.println("The Value that is on the position  " + Counter + " in the Queue is: " +out);
            }
	       
	    System.out.println("\nA queue uses FIFO strategy to display its values, End of queue.");
	   }
           else if (choice == 2)
           {
        
         // implement circular queue 
            
	       do
	       {      
		   System.out.println("Enter the numSize of the Queue: ");
                   numSize = sc.nextInt();   
		   System.out.println();
	       }  
	       while(numSize <= 0);
	       
	      //using an array                            
	       DSAcircularQueue q = new DSAcircularQueue(numSize);
	       
                // This for loop will loop to insert the value in the queue 
	      for(int i = 0; i < numSize; i++)
              {
                 
                  System.out.print("Please input a value in the Queue: \n");
                  ans = sc.nextLine();    
                  q.enQueue(ans); // add element in the queue
               }
  
	 
                  System.out.println(); 
	   // This FOR LOOP ,will loop until values in the queue have been displayed using the FIFO strategy
	    for(int j = 0; j < numSize; j++)
            {
               Counter = q.getCounter();
              //remove element from the queue  
              out = q.deQueue();                                                     
               System.out.println("The Value that is on the position  " + Counter + " in the Queue is: " + out);
            }
	       
	    System.out.println("\nA queue uses FIFO strategy to display its values, End of queue.");
	   }
        
        
        else if (choice == 3)
        {
        
           
        System.out.println("End of program.\n Bye!\n GoodDay."); 
        
        }  //end of if statement
        
    }while((choice < 0)||(choice > 4)); //end of while loop 
 }
}
  
