package LowLevelDesign.Java_Fundamentals.LLD5_Threads.AdditionalProblem_3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for(int i=1;i<=n;i++)
            {
                TableCreator tc = new TableCreator(i);
                ScalerThread st = new ScalerThread(tc);
                st.start();
            }
        }
    }
}
