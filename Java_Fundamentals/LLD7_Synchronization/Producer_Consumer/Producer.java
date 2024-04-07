package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.Producer_Consumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;

    Producer(Store str, Semaphore prod, Semaphore cons){
        store = str;
        prodSema = prod;
        consSema = cons;
    }

    @Override
    public void run() {
        while(true){
            // if(store.items.size()<store.maxSize)
                try {
                    prodSema.acquire();
                    store.addItem(new Object());
                    consSema.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
