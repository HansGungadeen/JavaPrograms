// Question 2 code

import java.util.*;
import java.io.*;

public class DSALinkedList implements Iterable, Serializable
{
    //class fields
    private ListNode head;
    private ListNode tail;
    private int size;

    public Iterator iterator()
    {
        return new LinkedListIterator(this);
    }

    //default constructor
    public DSALinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertLast(Object inValue)
    {
        ListNode newNode = new ListNode(inValue);

        if (isEmpty()) 
        {
            head = newNode;
        } 
        else
        {
            tail.setNext(newNode); 
            newNode.setPrev(tail); 
        }

        tail = newNode; 
        size++;
    }

    public boolean isEmpty()
    {
        return (head == null); 
    }

    public boolean contains(Object inValue)
    {
        boolean contains = false;

        Iterator iter = this.iterator();

        while (iter.hasNext()) 
        {
            if (iter.next().equals(inValue))
            {
                contains = true;
            }
        } 
        return contains;
    }

    public Object peekFirst()
    {
        Object nodeValue;

        if (isEmpty())
        {
            throw new IllegalStateException("List is empty");
        }
        else
        {
            nodeValue = head.getValue();
        }
        return nodeValue;
    }

    public Object peekLast()
    {
        Object nodeValue;

        if (isEmpty())
        {
            throw new IllegalStateException("List is empty");
        }
        else
        {
            nodeValue = tail.getValue();
        }
        return nodeValue;
    }

    public void printLinkedList()
    {
        ListNode p, nextNode;

        p = head;

        if (p == null) 
        {
            System.out.println("\t\tNothing in the list.");
        }
        else
        {
            while (p != null)
            {
                nextNode = p.getNext();
                System.out.println("\t\t" + p.getValue().toString());
                p = nextNode;
            }
        }
    }

    public ListNode getTail()
    {
        return this.tail;
    }

    public ListNode getHead()
    {
        return this.head;
    }

    public int getSize()
    {
        return this.size;
    }

    private class LinkedListIterator implements Iterator
    {
        private ListNode iterNext;

        public LinkedListIterator(DSALinkedList theList)
        {
            iterNext = theList.head;
        }

        public boolean hasNext()
        {
            return (iterNext != null);
        }

        public Object next()
        {
            Object value;
            if (iterNext == null)
            {
                value = null;
            }
            else
            {
                value = iterNext.getValue(); 
                iterNext = iterNext.getNext();
            }
            return value;
        }

        public void remove()
        {
            throw new UnsupportedOperationException("Not supported");
        }
    }
}