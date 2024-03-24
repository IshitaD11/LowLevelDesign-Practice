package LowLevelDesign.Java_Fundamentals.LLD5_Threads.AdditionalProblem_1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            Adder ad = new Adder(a,b);
            ScalerThread st = new ScalerThread(ad);
            st.start();
        }
    }
}
