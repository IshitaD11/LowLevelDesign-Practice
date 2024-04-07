package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.MergeSortCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>>{
    private List<Integer> arrayToSort;
    private ExecutorService ex;

    public Sorter(List<Integer> list,ExecutorService ex){
        this.arrayToSort = list;
        this.ex = ex;
    }

    @Override
    public List<Integer> call() throws Exception {
        
        if(arrayToSort.size()<=1)
            return arrayToSort;
        
        int mid = arrayToSort.size()/2;
        List<Integer> leftList = arrayToSort.subList(0, mid-1);
        List<Integer> rightList = arrayToSort.subList(mid, arrayToSort.size()-1);

        Sorter leftSorter = new Sorter(leftList, ex);
        Sorter rightSorter = new Sorter(rightList, ex);

        Future<List<Integer>> leftSFuture = ex.submit(leftSorter);
        Future<List<Integer>> rightSFuture = ex.submit(rightSorter);

        List<Integer> leftSortedList = leftSFuture.get();
        List<Integer> rightSortedList = rightSFuture.get();
        
        return mergerTwoLists(leftSortedList,rightSortedList);

    }

    public List<Integer> mergerTwoLists(List<Integer> leftSortedList,List<Integer> rightSortedList){
        List<Integer> mergedList = new ArrayList<>();

        int lsize = leftSortedList.size();
        int rsize = rightSortedList.size();
        int l=0;
        int r=0;

        while(l<lsize && r<rsize){
            if(leftSortedList.get(l)<rightSortedList.get(r)){
                mergedList.add(leftSortedList.get(l));
                l++;
            }
            else{
                mergedList.add(rightSortedList.get(r));
                r++;
            }
        }

        while(l<lsize){
            mergedList.add(leftSortedList.get(l));
            l++;
        }

        while(r<rsize){
            mergedList.add(rightSortedList.get(r));
            r++;
        }

        return mergedList;
    }
    
}
