package LowLevelDesign.Java_Fundamentals.LLD9_Generics.practice;

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
        System.out.println("inside Iterable");
        return new ListIterator<E>(this) ;            
    }
    


}
