package ScalerLLD.LLD6_Callables_Runnables.Assignment1;

// Create a class TreeSizeCalculator to calculate the size of a BinaryTree using multiple threads.
// TreeSizeCalculator constructor will be passed the root of the tree and ExecutorService to make new threads.
// TreeSizeCalculator should implement Callable<Integer> interface

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer>{

    Node root;
    ExecutorService ex;

    TreeSizeCalculator(Node nn, ExecutorService ex)
    {
        this.root=nn;
        this.ex=ex;
    }

    @Override
    public Integer call() throws Exception {
        if(root==null)
            return 0;

        // creating new task for left and right tree
        TreeSizeCalculator leftTree = new TreeSizeCalculator(root.left,ex);
        TreeSizeCalculator rightTree = new TreeSizeCalculator(root.right,ex);

        Future<Integer> leftTreeFuture = ex.submit(leftTree);
        Future<Integer> rightTreeFuture = ex.submit(rightTree);

        Integer leftSize = leftTreeFuture.get();
        Integer rightSize = rightTreeFuture.get();
    
        return leftSize+rightSize+1;
    }
    
}