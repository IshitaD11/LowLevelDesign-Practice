package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.PrintNumbersSequntial;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumber implements Runnable{
    
    private int num;
    private Lock lock = new ReentrantLock();

    public PrintNumber(int n){
        num = n;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("Thread: " + Thread.currentThread().getName() + " - Num: " + num);
        lock.unlock();
    }
}