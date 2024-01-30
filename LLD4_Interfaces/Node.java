package ScalerLLD.LLD4_Interfaces;

import java.util.Iterator;

public class Node implements Iterable<Node>{

    public int data;
    public Node next;

    public Node(int d){
        this.data = d;
        this.next = null;
    }

    public Node(int d, Node n){
        this.data = d;
        this.next = new Node(n.data);
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
    
    public static class NodeIterator implements Iterator<Node>{

        Node head;

        // to set head
        NodeIterator(Node nn)
        {
            this.head = nn;
        }

        @Override
        public boolean hasNext() {
            return head!=null;
        }

        @Override
        public Node next() {
            Node nn = head;
            head=head.next;
            return nn;
        }
    }
    
}
