package DSAq;

import java.util.*;

public class DSAshufflingqueue extends DSAqueue
{
  
  // Class Fields;
  private String[] q;
  private int Counter;
  private int front;
  private int rear;
  private int maxCap;
  
  //constant
  public static final int defaultCap = 100; 
  
   // DEFAULT Constructor
   public DSAshufflingqueue()
   {
      
      q = new String[defaultCap];
      rear = Counter = front = 0;
   }
   
  
  // ALTERNATE Constructor
   public DSAshufflingqueue(int maxCap)
   {
     q = new String[maxCap];
      front = 0;
      rear = 0;
      Counter = 0;
   }
  
  //ACCESSOERS OR GETTERS
  
  //isFull()
  @Override
   public boolean isFull()
   {  
      
      boolean full;
   
      if (Counter == q.length)
       {
          full = true;
       }
       else
       {
          full = false;
       }
       return full;
    }
  
   //getCounter()
   @Override
   public int getCounter()
   {
    
      return Counter;
   }
  
   //isEmpty()
   @Override
   public boolean isEmpty()
   {  
      boolean empty;
     if (Counter == 0)
     {
        empty = true;
     }
     else
     {
       empty = false;
     }
     return empty;
   }
  
   //peek()
   // check the  front item but do not take it off
   // shuffling  effect occur
   @Override
   public String peek()
   {
       String ans = "";
  
      if (isEmpty() == true)
      {
        
         System.out.println("The Queue is empty.");
      }
      else 
      {
        ans = q[0];
      } 
      
      return ans;    
   }
    
  // SETTERS OR MUTATORS
  
  //deQueuE()
  //remove element from the queue
  
  @Override
  public String deQueue()
  { 
       String answer = "";
      if (isEmpty() == true)
      {
         // if queue is EMPTY
         System.out.println("The Queue is empty.");
      }
       
         // to the right by one 
     else 
      { 
          answer = peek();
       
          for (int i = 0; i < rear - 1; i++) 
          { 
              q[i] = q[i + 1]; //shuffling
           } 
      
       }
         
         return answer;
      }
     
 
 
  //enQueuE()
  //add element to the queue
  @Override
   public void enQueue(String val)
   {
       
      //check if queue is full
      if (isFull() == true)
      {
       System.out.println("The Queue is full."); 
      }
      else
      { 
         //NOT FULL so increment counter by 1
         Counter = Counter + 1;
         q[rear] = val;// store element at q[rear]
         rear = (rear + 1) % defaultCap;
      }
     }
}
