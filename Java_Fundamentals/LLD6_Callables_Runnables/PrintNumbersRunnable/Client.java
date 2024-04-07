package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.PrintNumbersRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        int n = 10;
        ExecutorService ex = Executors.newCachedThreadPool();

        for(int i=1;i<=n;i++){
            ex.submit(new PrintNumber(i));
            System.out.println("Main Thread: " + Thread.currentThread().getName());
        }
    }
}
