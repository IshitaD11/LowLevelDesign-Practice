package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Assignment2;

public class Client {
    public static void main(String[] args) {
        
        Node head = new Node(0);
        Node temp = head;

        for(int i=1;i<=6;i++){
            Node nn = new Node(i);
            temp.setNext(nn);
            temp = temp.getNext();
        }

        for(int val:head){
            System.out.println(val);
        }
    }
}
