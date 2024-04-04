package LowLevelDesign.Java_Fundamentals.LLD5_Threads.Threads;

public class Client {
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            Thread t = new Thread(new PrintNumber(i));
            t.start();
            System.out.println("Main - Thread: " + Thread.currentThread().getName());
        }

    }
}
