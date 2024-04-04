package LowLevelDesign.Java_Fundamentals.LLD10_Generics.practice;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private Node<E> head; 

    public void setHead(Node<E> head){
        this.head = head; 
    }

    public Node<E> getHead(){
        return head;
    }

    // adding node at the front
    public void addNode(E val){
        Node<E> newNode = new Node<>(val);
        newNode.setNextNode(head);
        head = newNode;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<E>(this) ;            
    }
    


}
