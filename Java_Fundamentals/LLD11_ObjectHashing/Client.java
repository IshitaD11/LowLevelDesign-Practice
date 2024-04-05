package LowLevelDesign.Java_Fundamentals.LLD11_ObjectHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Money> list = new ArrayList<>();

        list.add(new Money(100, Currency.USD));
        list.add(new Money(100, Currency.INR));
        list.add(new Money(100, Currency.USD));
        list.add(new Money(100, Currency.YEN));
        list.add(new Money(200, null));
        list.add(new Money(0,null));
        list.add(new Money(0,null));
        
        HashMap<Money,Integer> map = new HashMap<>();
        for(Money money:list){
            map.put(money,map.getOrDefault(money, 0)+1);
        }

        for(Money key:map.keySet()){
            System.out.println(key.toString() + "- Count: " + map.get(key));
        }
    }
}
