package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores.AdditionalProblem5;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {
    private int n;
    private boolean zero;
    private int num;
    private Object lock;

    ZeroEvenOdd(int n){
        this.n = n;
        num = 1;
        zero = true;
        lock = new Object();
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(num<=n){
            synchronized(lock){
                while(!zero){
                    lock.wait();
                }

                if(num<=n)
                    printNumber.accept(0);
                zero = false;
                lock.notifyAll();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        
        while(num<=n){
            synchronized(lock){
                while(zero || num%2!=0){
                    lock.wait();
                }

                if(num<=n){
                    printNumber.accept(num);
                    num++;
                }
                
                zero = true;
                lock.notifyAll();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

        while(num<=n){
            synchronized(lock){
                while(zero || num%2==0){
                    lock.wait();
                }

                if(num<=n){
                    printNumber.accept(num);
                    num++;
                }
                
                zero = true;
                lock.notifyAll();
            }
        }
    }
}
