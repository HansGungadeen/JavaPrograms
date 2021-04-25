package DSAstack;

import java.util.*;

public class DSAstack implements Iterable
{
	//fields
		 // private Object[] stacK;
		  private int counter;
		  DSAlinkedList stacK = new DSAlinkedList();
		  // list for the stack
		  private DSAlinkedList ll;
		  //constant
		  public static final int DefaultCap = 100;
		 
		 //DEFAULT constructor

		 /*public DSAstack()
		 { 
		    stacK = new Object[DefaultCap]; //alloc stacK arr with constant element
		    counter = 0;
		 }*/

		 //ALTERNATE constructor
		  
		 //public DSAstack(int maxCap)
		 //{
		   
		 // stacK = new Object[maxCap];
		 // counter = 0;
		 //}
		  
		//GETTERS or Accessors

		//getCounter
		 public int getCounter()
		 {
		   return counter;
		 } 

		//isEmpty()
		 public boolean isEmpty()
		 {
		    boolean empty;
		   
		    if(counter == 0)
		    { 
		      empty = true;
		    }
		    else
		    {
		      empty = false;
		    }
		   return empty;
		 }
		 
		// isFull()
		 /* public boolean isFull()
		  {
		     boolean full;
		    
		     if(counter == stacK.length)
		     {
		        full = true;
		     } 
		     else
		     {
		       full = false;
		     }
		     return full;
		  }*/

		  //topStack()
		 

		  public Object topStacK()
		  {
		    Object topAns = 0;
		    
		      if(isEmpty() == true)
		      {
		        throw new IllegalArgumentException("The STACK is overloaded");
		      }
		      else
		      {
		        topAns = stacK[counter - 1];
		      }
		     return topAns;
		  }


	/* ADDING LINKED LIST */
	 //MUTATORS OR SETTERS
		  
	 public void push(int val)
	 {
		 stacK.insertLast(ll);
	  
	    //stacK.insertLast();  
	  
	 }

	  //pop()
	  public void pop(int val)
	  {
	  
	   stacK.removeLast();
	   
	  }
	  

	
	      public Iterator iterator()
	      {
	          //returns a new instance of DSAlinkedListIterator
	          
	           //return new DSAlinkedListIterator(this);
	             return ll.iterator();
	             
	       }
	       private class DSAlinkedListIterator implements Iterator
	       {
	              private DSAlistNODE iterateNext;
	                 
	                 public  DSAlinkedListIterator(DSAlinkedList ll)
	                 { 
	                 
	                   iterateNext = ll.head;
	                   
	                  }
	                   //iterator interface implementation
	                   public boolean hasNext() 
	                   { 
	                    
	                     return (iterateNext != null);
	                     
	                   }
	                     
	                    public Object next()
	                    {
	                        Object val;
	                        
	                        if ( iterateNext  == null )
	                        
	                         val = null;
	                         
	                         else
	                         {
	                        
	                           val = iterateNext.getValue();
	                           iterateNext = iterateNext.getNext();
	                           
	                          }
	                           
	                          return val;
	                          
	                       }
	                           
	                        public void remove()
	                        {
	                            
		                     throw new UnsupportedOperationException("Not supported");
	                         }
	                      }
	  
	
	  
}







  
