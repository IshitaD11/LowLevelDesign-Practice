package LowLevelDesign.Java_Fundamentals.LLD3_AccessModifiers.Assignment1;

public class ThreedPoint extends Point{

    private int z;

    public ThreedPoint(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public void display(){
        System.out.println("[" + x + "," + y + "," + z + "]");
    }
    
}
