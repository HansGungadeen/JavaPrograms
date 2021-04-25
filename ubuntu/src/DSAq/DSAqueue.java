package DSAq;

import java.util.*;

public abstract class DSAqueue
{
  // cannot create object in abstract class
     
  // Class Fields;
 
  private int Counter;
  private int maxCap;
  private String[] q;
  
  //constant
  public static final int defaultCap = 100; 
  
   // DEFAULT Constructor
   public DSAqueue()
   {
      
      q = new String [defaultCap];
      Counter = 0;
   
   }
   
  // ALTERNATE Constructor
  
   public DSAqueue(int maxCap) 
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
   public abstract String peek();
 
  // SETTERS OR MUTATORS
  
  //deQueuE(), rmove element from the queue
public abstract String deQueue();
 
  
  //enQueuE()
  //add element to the queue
  
   public abstract void enQueue(String val);

}
