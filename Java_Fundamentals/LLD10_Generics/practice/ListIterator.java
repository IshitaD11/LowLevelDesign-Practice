package LowLevelDesign.Java_Fundamentals.LLD10_Generics.practice;

import java.util.Iterator;

public class ListIterator<E> implements Iterator<E>{
    Node<E> current;

    ListIterator(LinkedList<E> ll){
        current = ll.getHead();
    }

    @Override
    public boolean hasNext() {
        if(current!=null)
            return true;
        return false;
    }

    @Override
    public E next() {
        E val = current.getVal();
        current = current.getNext();
        return val;
    }

    
    
}
