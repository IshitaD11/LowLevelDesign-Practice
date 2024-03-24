package LowLevelDesign.Java_Fundamentals.LLD5_Threads.AdditionalProblem_3;

public class TableCreator implements Runnable{

    int num;

    TableCreator(int n)
    {
        this.num = n;
    }

    @Override
    public void run() {
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(i+" times "+num+ " is " + (i*num));
        }
        
    }
    
}
