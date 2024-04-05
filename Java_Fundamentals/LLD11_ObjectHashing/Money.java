package LowLevelDesign.Java_Fundamentals.LLD11_ObjectHashing;

public class Money {
    private int amount;
    private Currency curr;

    public Money(int amount,Currency curr){
        this.amount=amount;
        this.curr=curr;
    }

    @Override
    public boolean equals(Object other){
        if(other==this)
            return true;
        if(!(other instanceof Money))
            return false;
        Money oth = (Money)other;
        boolean currMatch = (this.curr==null && oth.curr==null) || (this.curr!=null && this.curr.equals(oth.curr));

        return currMatch && this.amount==oth.amount;
    }

    @Override
    public int hashCode(){
        int result = 17;

        if(curr!=null){
            result = result + curr.hashCode();
        }
        
        result = result + 29*amount;

        return result;
    }

    @Override
    public String toString(){
        return amount + " - " + curr;
    }
}
