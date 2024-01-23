package ScalerLLD.LLD6.Assignment1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Client {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Node root = new Node(10);
        int[] levelOrder = {5,6,7,8,9,12,3,5,6,3,2,88,34};
        createTree(root,levelOrder);

        ExecutorService ex = Executors.newCachedThreadPool();
        TreeSizeCalculator task = new TreeSizeCalculator(root,ex);

        Future<Integer> sizeFuture = ex.submit(task);
        Integer size = sizeFuture.get();

        System.out.println(size);
    }
    
    
    

    public static void createTree(Node root,int[] arr)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 0;
        while (i < arr.length) {
            Node curr = q.remove();
            if (i < arr.length) {
                curr.left = new Node(arr[i++]);
                q.add(curr.left);
            }
            if (i < arr.length) {
                curr.right = new Node(arr[i++]);
                q.add(curr.right);
            }
        }
    }
    

}
