package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.Producer_Consumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;

    Consumer(Store str, Semaphore prod, Semaphore cons){
        store = str;
        prodSema = prod;
        consSema = cons;
    }

    @Override
    public void run() {
        
        while(true){
            // if(store.items.size()>0)
            try {
                consSema.acquire();
                store.removeItem();
                prodSema.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
    }
}
