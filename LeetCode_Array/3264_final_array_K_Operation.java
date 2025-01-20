class  _3264_final_array_K_Operation{
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0)
        {
        int min=0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[min]>nums[i])
             {
                min=i;
             }
        }
        nums[min]*=multiplier;
        }
        return nums;
    }
}