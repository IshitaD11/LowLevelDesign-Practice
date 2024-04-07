package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.MergeSortCallable;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        List<Integer> list = List.of(7,8,2,5,1,8,2,77,213,0,3);

        ExecutorService ex = Executors.newCachedThreadPool();

        Sorter s = new Sorter(list, ex);
        Future<List<Integer>> sortedFuture = ex.submit(s);
        List<Integer> ans = sortedFuture.get();
        System.out.println(ans);
    }
    
}
