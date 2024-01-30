package ScalerLLD.LLD5_Threads.AdditionalProblem_1;

public class Adder implements Runnable{

    protected int a;
    protected int b;

    Adder(int x,int y)
    {
        a=x;
        b=y;
    }

    @Override
    public void run() {
        System.out.println(this.a+this.b);
    }
    
}
