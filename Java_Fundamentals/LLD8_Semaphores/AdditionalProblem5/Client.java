package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores.AdditionalProblem5;

import java.util.function.IntConsumer;

public class Client {
    public static void main(String[] args) {
        int n = 5;
        ZeroEvenOdd zeo = new ZeroEvenOdd(n);
        IntConsumer printNumber = (value) -> System.out.println(value);  
           

        Thread A = new Thread(
            () -> {
                try{
                    zeo.zero(printNumber);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        );

        Thread B = new Thread(
            () -> {
                try{
                    zeo.even(printNumber);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        );

        Thread C = new Thread(
            () -> {
                try{
                    zeo.odd(printNumber);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        );

        A.start();
        B.start();
        C.start();
    }
}
