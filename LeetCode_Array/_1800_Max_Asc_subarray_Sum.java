public class _1800_Max_Asc_subarray_Sum {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int inc=nums[0];
        int MaxSum=nums[0];
        // int MaxElement=nums[0];

        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                inc+=nums[i];
                MaxSum=Math.max(MaxSum , inc );
            }
            else{
                inc=nums[i];
                MaxSum=Math.max(MaxSum , inc );
            }
        }
        return MaxSum ;
    }
}
