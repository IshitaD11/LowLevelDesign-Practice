package LowLevelDesign.Java_Fundamentals.LLD5_Threads.Threads;

public class PrintNumber implements Runnable{
    private int num;

    public PrintNumber(int n){
        num=n;
    }

    @Override
    public void run() {
        System.out.println("Num: "+num);
        System.out.println("Thread: " + Thread.currentThread().getName());
    }
    
}
