package LowLevelDesign.Java_Fundamentals.LLD6_Callables_Runnables.AdditionalProblem2;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>>{

    int n;

    ArrayCreator(int n)
    {
        this.n=n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=this.n;i++)
        {
            list.add(i);
        }
        return list;
    }
    
}
