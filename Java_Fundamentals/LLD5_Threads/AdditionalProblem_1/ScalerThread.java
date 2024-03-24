package LowLevelDesign.Java_Fundamentals.LLD5_Threads.AdditionalProblem_1;

import java.util.HashMap;

public class ScalerThread extends Thread{
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    ScalerThread(Runnable r){
        super(r);
        target = r.getClass().getName();
    }

    @Override
    public void start() {
        super.start();
        map.put(target, this.getName());
    }
}
