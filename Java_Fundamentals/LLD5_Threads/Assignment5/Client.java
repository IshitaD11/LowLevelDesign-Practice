package LowLevelDesign.Java_Fundamentals.LLD5_Threads.Assignment5;

public class Client {
    public static void main(String[] args) {

        Thread tAdd = new Thread(new Adder());
        Thread tSub = new Thread(new Subtractor());

        tAdd.start();
        tSub.start();
        System.out.println("I am main Thread");

    }
    
}
