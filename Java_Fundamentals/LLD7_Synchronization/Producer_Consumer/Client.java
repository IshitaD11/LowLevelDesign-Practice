package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.Producer_Consumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Store store = new Store(5);
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
       
        for(int i=1;i<=5;i++){
            ex.execute(new Producer(store,prodSema,consSema));
        }

        for(int i=1;i<=5;i++){
            ex.execute(new Consumer(store,prodSema,consSema));
        }
    }
}
