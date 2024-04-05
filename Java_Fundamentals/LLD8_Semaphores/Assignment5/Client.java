package LowLevelDesign.Java_Fundamentals.LLD8_Semaphores.Assignment5;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            FooBar fooBar = new FooBar(n);

            Thread threadA = new Thread(
                () -> {
                    // inside the main runnable fooBar.foo is called, which is again passing a Runnable attr 
                try {
                    fooBar.foo(
                        () -> System.out.println("foo") // run method of the runnable parameter of foo
                        );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            Thread threadB = new Thread(() -> {
                try {
                    fooBar.bar(() -> System.out.println("bar")); // Print "bar" using the bar method
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threadA.start(); // Start thread A
            threadB.start(); // Start thread B
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
