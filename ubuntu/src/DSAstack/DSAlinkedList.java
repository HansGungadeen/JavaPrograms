package DSAstack;

import java.util.*;

public class DSAlinkedList implements Iterable
{

   int nodeVal;
   int newVal;
 
   
  
   // this class keeps the track of each element info 
   private class DSAlistNODE 
   {
      //creating private inner class
      
      private Object val;
      private DSAlistNODE next;
      private DSAlistNODE prev;
     
     
      
      
      public DSAlistNODE(Object inVal)
      {
         val  = inVal ;
         next = null;
         prev = null;
      }
      
    
      //Mutator/Setters for setting value 
      
       public void setValue(Object inVal)
        {
           val = inVal;
        
         }
    
      //Accessor/Getter to get value
    
        
        public Object getValue()
        {
       
          return val;
        
        }
       
       //Mutator for setting next
        
        public void setNext(DSAlistNODE newNext)  
        {
           next = newNext;
           
         }
           
       //Accessor/Getter to get next
      
       public DSAlistNODE getNext()
       {
       
           return next;
           
        }
        
        

      //Mutator for setting prev
     
      public void setPrev(DSAlistNODE newPrev )
      {
      
       prev = newPrev;
       
       }
    
     //Acessor to get prev
        
      public DSAlistNODE getPrev()
      {
      
      return prev;
      
      }
      
      
       public void setNext()
        {
          next = null;
        
        } 
        public void setPrev()
        {
          prev = null;
        }  
      
    }
  
      DSAlistNODE head = null;
      DSAlistNODE tail = null;
      
      public  DSAlinkedList()
      {
      
        head = null;
        tail = null;
      }
       
      //Check if the list is empty or not
      public boolean isEmpty()
      { 
      
         boolean ans;
       
       if((head==null) && (tail==null))
       {
       
        ans = true;
        
       } 
       else
       {
       
        ans = false;
         
       }
         return ans; 
       
       }
        
        
      // adding value at the start of the linked list
      public void insertFirst(Object newVal)
      {
         DSAlistNODE newNd = new  DSAlistNODE(newVal);
          
         if(isEmpty())
         { 
              head = newNd;
              tail = newNd;
         }
         else
         {
           
            newNd.setNext(head);
            newNd.setPrev(null);
            head = newNd;
            
         }
       }   
          
          
      //inserting value at the end of the linked list
        public void insertLast( Object newVal)
        {
           DSAlistNODE newNd  = new  DSAlistNODE(newVal);
             
           if(isEmpty())
           { 
               head = newNd;
               tail = newNd;
               
           }
           else
           {
             
              newNd.setPrev(tail);
               newNd.setNext();
                tail = newNd;
           }
           
      
         }
          
       //This method remove value from the start of the linked list
        public Object removeFirst()
        {
          
          Object nodeVal = "";
          
          if(isEmpty())
          {
               throw new IllegalArgumentException("The list is empty");
          }
          else
          { 
              nodeVal = head.getValue();
              head = head.getNext();
              head.setPrev();
          }
          
             return nodeVal;
         }
               
        //This method remove value at the end of the linked list
         public Object removeLast()
         {   
            Object nodeVal = "";
            
            if(isEmpty())
            {
                  throw new IllegalArgumentException("The list is empty");
                 
            }
            else
            { 
               nodeVal = tail.getValue();
               tail = tail.getPrev();
               tail.setNext(null);
           }
             
             return nodeVal;
         }
             
          
         //peekFirst method
          
          public Object peekFirst()
          {
               Object nodeVal = null;
               
               if(isEmpty())
                {
                
                   System.out.print("list is empty");
                  
                } 
                else 
                {
                
                  nodeVal = head.getValue();
                   
                }
 
               return nodeVal;

            }

             //peekLast method
          
          public Object peekLast()
          {
               Object nodeVal = null;
               
               if(isEmpty())
                {
                
                  System.out.print("Empty list");
                  
                   
                } 
                else 
                {
                
                  nodeVal = tail.getValue();
                    
                }

               return nodeVal;

            }


          //iterator 
          
          
       public Iterator iterator()
       {
          //returns a new instance of DSAlinkedListIterator
          
           return new DSAlinkedListIterator(this);
             
             
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
	/*public void insertLast() {
		// TODO Auto-generated method stub
		
	}
            
         }*/
            
           


 
