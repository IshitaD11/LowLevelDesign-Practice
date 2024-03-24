package LowLevelDesign.Java_Fundamentals.LLD1_OPPs.OPPS2;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        String A = "0111111001";
        int n=A.length();
        boolean found0 = false;
        ArrayList<Integer> flipped = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(A.charAt(i)=='1')
                flipped.add(-1);
            else
            {
                flipped.add(1);
                found0=true;
            }
        }
        
        // no zeros are there do not flip
        if(!found0)
            System.out.println("blank ArrayList");
            
        // apply Kadane's algo, to get max sum subarray
        int sum=0;
        int maxSum=0;
        int lftIdx=0;
        int rgtIdx=0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(rgtIdx<n)
        {
            sum=sum+flipped.get(rgtIdx);
            
            if(sum<0)
            {
                lftIdx=rgtIdx+1;
                sum=0;
            }
            if(maxSum<sum)
            {
                ans=new ArrayList<>();
                ans.add(lftIdx+1);
                ans.add(rgtIdx+1);
                maxSum=sum;
            }
            rgtIdx++;
        }
        
        System.out.println(ans);
    }
}