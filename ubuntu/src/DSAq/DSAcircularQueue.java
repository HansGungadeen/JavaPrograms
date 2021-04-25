package DSAq;

import java.util.*;

public class DSAcircularQueue extends DSAqueue
{
  // cannot create object in abstract class
     
  // Class Fields;
 
  private int Counter;
  private int maxCap;
  private String[] q;
  private int firstPosition;
  private int lastPosition;

  
  //constant
  public static final int defaultCap = 100; 
  
   // DEFAULT Constructor
   public DSAcircularQueue()
   {
      
      q = new String [defaultCap];
      //rear = Counter = front = 0;
      Counter = 0;
   
   }
  // ALTERNATE Constructor
   public DSAcircularQueue(int maxCap) 
   {
     q = new String[maxCap];
      Counter = 0;
   }
  
  //ACCESSOERS OR GETTERS
  
  //isFull()
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
   public int getCounter()
   {
     
      return Counter;
   }
  
   //isEmpty()
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
   @Override
   public String peek()
   {
     String value = "";
     
     if(isFull())
     {
      System.out.println("Queue is empty");
     }
     else
     {
        value = q[firstPosition];
     }
   
     return value;
   }
 
  // SETTERS OR MUTATORS
  
  //deQueuE(), remove element from the queue
  @Override
  public String deQueue()
  {
     String value = "";
     
    if(isEmpty())
    {
     System.out.println("Queue is empty");
    }
    else
    {
      value = peek() ;
      firstPosition++;
      Counter--;
    }
    return value;
  
  }
 
  
  //enQueuE()
  //add element to the queue
  @Override
   public void enQueue(String value)
   {
     if (!isFull())
     {
       q[lastPosition] = value;
       lastPosition++;
       
       if((lastPosition == q.length) && (firstPosition != 0))
       {
          lastPosition = 0;
       }
        
        Counter = Counter + 1;
     }
     
   }

}
