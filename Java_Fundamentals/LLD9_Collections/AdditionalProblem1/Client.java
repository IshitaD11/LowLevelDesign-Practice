package LowLevelDesign.Java_Fundamentals.LLD9_Collections.AdditionalProblem1;

import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        PriorityQueue<Car> pqCar = new PriorityQueue<>();
        pqCar.add(new Car(10, 20));
        pqCar.add(new Car(5, 100));
        pqCar.add(new Car(2, 65));
        pqCar.add(new Car(7, 200));
        pqCar.add(new Car(6, 5));
        pqCar.add(new Car(1, 77));

        while(pqCar.size()>0)
        {
            Car c = pqCar.poll();
            System.out.println(c.toString()); 
        }
    }
}
