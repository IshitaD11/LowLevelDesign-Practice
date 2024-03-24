package LowLevelDesign.Java_Fundamentals.LLD9_Collections.AdditionalProblem2;

import java.util.List;
import java.util.TreeSet;

public class Client {
    
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(List.of(4,6,2,9,10,44,2,986,45,33,1));
        System.out.println(getJustLarger(set,9));
        System.out.println(getJustLarger(set,25));
        System.out.println(getJustSmaller(set,2));
        System.out.println(getJustSmaller(set,25));
    }

    public static Integer getJustLarger(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just larger than data
        if(treeSet.contains(data))
            return data;
        else 
            return treeSet.ceiling(data);
        
    }

    public static Integer getJustSmaller(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just smaller than data
        if(treeSet.contains(data))
            return data;
        else 
            return treeSet.floor(data);
    }
}
