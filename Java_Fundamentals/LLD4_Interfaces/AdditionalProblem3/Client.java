package LowLevelDesign.Java_Fundamentals.LLD4_Interfaces.AdditionalProblem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Car> ls = new ArrayList<>();

        ls.add(new Car(100, 2));
        ls.add(new Car(22, 2));
        ls.add(new Car(50, 2));
        ls.add(new Car(2, 2));
        ls.add(new Car(43, 2));

        Collections.sort(ls);

        for(Car c:ls){
            System.out.println(c.toString());
        }
    }
}
