package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores;

import java.util.concurrent.Semaphore;

class Foo {
    Semaphore firstSema;
    Semaphore secondSema;
    Semaphore thirdSema;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
