package LowLevelDesign.Java_Fundamentals.LLD4_Interfaces.AdditionalProblem4;

public class Client {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node temp = head;
        temp.next = new Node(22);
        temp = temp.next;
        temp.next = new Node(2);
        temp = temp.next;
        temp.next = new Node(9);
        temp = temp.next;
        temp.next = new Node(15);
        temp = temp.next;

        for(Node nn:head){
            nn.display();
        }
    }
}
