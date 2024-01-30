package ScalerLLD.LLD6_Callables_Runnables.AdditionalProblem2;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ExecutorService ex = Executors.newCachedThreadPool();
        ArrayCreator ac = new ArrayCreator(n);
        Future<ArrayList<Integer>> listFuture = ex.submit(ac);
        ArrayList<Integer> ans = listFuture.get();
        System.out.println(ans);
    }
}
