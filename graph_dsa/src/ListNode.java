// Question 2 code

import java.io.*;

public class ListNode implements Serializable
{
    private Object value;
    private ListNode next;
    private ListNode prev;

    public ListNode(Object inValue)
    {
        value = inValue;
        next = null;
        prev = null;
    }

    public void setValue(Object inValue)
    {
        this.value = inValue;
    }

    public void setNext(ListNode newNext)
    {
        this.next = newNext;
    }

    public void setPrev(ListNode newPrev)
    {
        this.prev = newPrev;
    }

    public Object getValue()
    {
        return this.value;
    }

    public ListNode getNext()
    {
        return this.next;
    }

    public ListNode getPrev()
    {
        return this.prev;
    }

    public String toString()
    {
        String nodeStr;
        nodeStr = value.toString();

        return nodeStr;
    }
}
