package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.Adder_Subtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void>{

    private Value v;
    private Lock lock;

    public Adder(Value v, Lock lock){
        this.v = v;
        this.lock = lock;
    }
    
    @Override
    public Void call() throws Exception {
        for(int i=0;i<100000;i++)
        {
            lock.lock();
            v.val++;
            lock.unlock();
        }
            
        return null;
    }
}