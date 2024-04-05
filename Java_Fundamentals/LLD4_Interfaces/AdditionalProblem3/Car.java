package LowLevelDesign.Java_Fundamentals.LLD4_Interfaces.AdditionalProblem3;

public class Car implements Comparable<Car>{
    private int price;
    private int speed;

    public Car(int p,int s){
        price = p;
        speed = s;
    }

    @Override
    public int compareTo(Car otherCar){
        return price - otherCar.price;
    }

    @Override
    public String toString(){
        return "price: " + price + ", speed: "+ speed; 
    }
}
