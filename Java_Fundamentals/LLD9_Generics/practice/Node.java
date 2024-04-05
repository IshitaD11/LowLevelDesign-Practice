package LowLevelDesign.Java_Fundamentals.LLD9_Generics.practice;

public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val){
        this.val = val;
        next = null;
    }


    public Node(T v, Node<T> nxt){
        val = v;
        next = nxt;
    }

    public void setNextNode(Node<T> next){
        this.next = next;
    }

    public T getVal(){
        return val;
    }

    public Node<T> getNext(){
        return next;
    }
}
