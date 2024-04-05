package LowLevelDesign.Java_Fundamentals.LLD4_Interfaces.AdditionalProblem4;

import java.util.Iterator;

public class Node implements Iterable<Node>{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null; 
    }

    public Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    public void display(){
        System.out.println(data);
    }

    @Override
    public Iterator<Node> iterator(){
        return new NodeIterator(this);
    }

    public static class NodeIterator implements Iterator<Node>{
        Node head;

        public NodeIterator(Node nn){
            this.head = nn;
        } 

        @Override
        public boolean hasNext(){
            return head!=null;
        }

        @Override
        public Node next(){
            Node nn = head;
            head = head.next;
            return nn;
        }
    }
}
