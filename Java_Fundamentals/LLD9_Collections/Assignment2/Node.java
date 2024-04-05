package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Assignment2;

import java.util.Iterator;

public class Node implements Iterable<Integer>{
    private int data;
    private Node next;

    public Node(int val){
        this.data = val;
        next = null;
    }

    public void setNext(Node nn){
        next = nn;
    }

    public Node getNext(){
        return next;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Integer> iterator()
    {
        return new NodeIterator(this);
    }

    public static class NodeIterator implements Iterator<Integer>{
        Node head;

        NodeIterator(Node nn)
        {
            this.head=nn;
        }

        // returns false if next element does not exist 
        @Override
        public boolean hasNext()
        {
            if(head==null)
                return false;
            return true; 
        }

        // return current data and update pointer 
        @Override
        public Integer next()
        {
            int nodeVal = head.data;
            head = head.next;
            return nodeVal;
        }
    }
}
