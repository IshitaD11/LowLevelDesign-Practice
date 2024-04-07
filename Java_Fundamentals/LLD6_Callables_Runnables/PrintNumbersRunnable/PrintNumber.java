package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.PrintNumbersRunnable;

public class PrintNumber implements Runnable{
    
    private int num;

    public PrintNumber(int n){
        num = n;
    }

    @Override
    public void run() {
        
        System.out.println("Thread: " + Thread.currentThread().getName() + " - Num: " + num);

    }
}