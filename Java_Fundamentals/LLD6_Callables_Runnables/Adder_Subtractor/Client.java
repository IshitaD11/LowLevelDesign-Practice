package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.Adder_Subtractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        Value value = new Value(0);

        ExecutorService ex = Executors.newCachedThreadPool();
        Lock lock = new ReentrantLock();

        Future<Void> add = ex.submit(new Adder(value,lock));
        Future<Void> sub = ex.submit(new Subtractor(value,lock));

        add.get();
        sub.get();

        System.out.println(value.val);
    }
}
