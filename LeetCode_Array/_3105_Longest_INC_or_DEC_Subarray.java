public class _3105_Longest_INC_or_DEC_Subarray {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(nums.length==1)
        {
            return 1;
        }
        int inc=1;
        int dec=1;
        int MaxInc=1;
        int MaxDec=1;
        int i=0;
        while(i<n-1)
        {
            if(nums[i]<nums[i+1])
            {
                inc++;
                dec=1;
            }
            else if(nums[i]>nums[i+1])
            {
                dec++;
                inc=1;
            }
            else{
                dec=1;
                inc=1;
            }
            MaxInc=Math.max(MaxInc ,inc );
            MaxDec=Math.max(MaxDec ,dec );
            i++;
        }
        return  Math.max(MaxInc ,MaxDec);
    }
}
