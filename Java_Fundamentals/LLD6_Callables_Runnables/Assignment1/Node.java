package ScalerLLD.LLD6_Callables_Runnables.Assignment1;

// A class Node to represent the Node of a BinaryTree.
// Node should have two properties - left and right of type Node.
// Node should also have an integer property - data.


public class Node{
    Node left;
    Node right;
    int data;

    Node(int dt)
    {
        data=dt;
        left=null;
        right=null;
    }

    
}