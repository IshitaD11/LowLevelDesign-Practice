package LowLevelDesign.Java_Fundamentals.LLD1_OPPs.OPPS2;
public class Circle extends Point{

    private int z;

    public void display()
    {
        int x=getX();
        int y=getY();
        System.out.println("["+x+","+y+","+z+"]");
    }


    // Point center;
    // int radius;

    // double getArea()
    // {
    //     return ((Math.PI)*(Math.pow(this.radius,2)));
    // }

    // double getParameter()
    // {
    //     return ((double)2*(Math.PI)*(this.radius));
    // }

    // boolean isOverlapping(Circle c1)
    // {
    //     // distance between 2 centres
    //     int diffx = (int)Math.pow((this.center.x-c1.center.x),2);
    //     int diffy = (int)Math.pow((this.center.y-c1.center.y),2);

    //     int diff = (int)Math.sqrt(diffx+diffy);

    //     // check if sum of 2 radius is less then it is not Overlapping
    //     return ((this.radius+c1.radius)>diff);
    // }
}
