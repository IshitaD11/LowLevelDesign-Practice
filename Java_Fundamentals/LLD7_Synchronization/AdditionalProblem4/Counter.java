package LowLevelDesign.Java_Fundamentals.LLD7_Synchronization.AdditionalProblem4;

public class Counter {
    private int count;

    public Counter(int cnt)
    {
        this.count = cnt;
    }

    public synchronized void incValue(int offset)
    {
        count += offset;
    }

    public synchronized void getValue()
    {
        System.out.println(count);
    }

    public synchronized void decValue(int offset)
    {
        count -= offset;
    }
}
