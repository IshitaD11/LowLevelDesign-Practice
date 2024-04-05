package LowLevelDesign.Java_Fundamentals.LLD3_AccessModifiers.Assignment1;

public class Client {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        p.display();
        ThreedPoint tp = new ThreedPoint(1, 2, 3);
        tp.display();
        Point p2 = new  ThreedPoint(1, 2, 3);
        p2.display();
    }
}
