package LowLevelDesign.Java_Fundamentals.LLD3_AccessModifiers.Assignment1;

public class Point {

    protected int x;
    protected int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("[" + x + "," + y + "]");
    }
    
}
