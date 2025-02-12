import java.util.HashMap;

public class _2342_MaximumSum_of_Equal_DigitSum {
public int maximumSum(int[] nums) {
        HashMap<Integer , Integer > num_digitSum=new HashMap<>();
        int sum=0;
        boolean isContain=false;
        for(int i=0;i<nums.length;i++)
        {   
            int digitSum=digitSum(nums[i]);
            if(num_digitSum.containsKey(digitSum))
            {
                int prevNumber=num_digitSum.get(digitSum);
                isContain=true;
                sum=Math.max(sum , prevNumber + nums[i]);
                num_digitSum.put(digitSum , Math.max(prevNumber , nums[i]));
            }
            else
            {   
                num_digitSum.put(digitSum ,nums[i]);
            }
        }
        if(isContain)
        return sum;
        else
        return -1;
    }

    private int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum;
    }
}
