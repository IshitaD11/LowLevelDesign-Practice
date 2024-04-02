package LowLevelDesign.Java_Fundamentals.LLD1_OPPs.Final;

public class ParentClass{
    private final int attr1;

    ParentClass(int val){
        // initialized in constructor
        attr1 = val;
    }

    public void method1(){
        // can not be assigned
        // attr1++;
        // attr1 = 5;
        // attr1 = 5;
    }

    public final void finalMethod(){
        System.out.println("This is final method"+attr1);
    }
}