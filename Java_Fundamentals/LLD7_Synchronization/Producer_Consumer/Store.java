package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.Producer_Consumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Object> items;
    int maxSize;

    Store(int size){
        items = new ArrayList<>();
        maxSize = size;
    }

    public void addItem(Object ob){
        items.add(ob);
        System.out.println("Items added");
    }

    public void removeItem(){
        items.remove(items.size()-1);
        System.out.println("Items removed");
    }
}
