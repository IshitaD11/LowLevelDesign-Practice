package LowLevelDesign.Java_Fundamentals.LLD1_OPPs.Inheritance;

public class Child1 extends Parent{
    private int child1Att;

    public void printChild1(){
        System.out.println(child1Att);
        System.out.println(parAtt3); // protected can be accessed via child
        System.out.println(parAtt4); // default can be accessed via child
        // private can not be accessed
    }
}
