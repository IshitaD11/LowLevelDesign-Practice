package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores.AdditionalProblem4;

import java.util.concurrent.Semaphore;

public class H2O{
    Semaphore HSema;
    Semaphore OSema;

    H2O(){
        HSema = new Semaphore(2);
        OSema = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        HSema.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        OSema.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        OSema.acquire();
        OSema.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
        HSema.release();
        HSema.release();
    }

}