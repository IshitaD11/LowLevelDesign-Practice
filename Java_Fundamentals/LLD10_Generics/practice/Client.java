package LowLevelDesign.Java_Fundamentals.LLD10_Generics.practice;

public class Client {
    public static void main(String[] args) {
        // string LL
        LinkedList<String> strLL = new LinkedList<>();
        strLL.addNode("Tail");
        strLL.addNode("tail-1");
        strLL.addNode("tail-2");
        strLL.addNode("Head");

        // strLL.setHead(head);

        for(String str:strLL){
            System.out.println(str);
        }
    }
}
