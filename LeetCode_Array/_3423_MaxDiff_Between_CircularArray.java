public class _3423_MaxDiff_Between_CircularArray {
     public int maxAdjacentDistance(int[] nums) {
        
        /* Brute Force Approach 
        1. First of all loop the nums array and find the difference and update
          the max diff accordingly 
        2.Then find the diff bet 1st and last and answer accordingly 
            */

         int n = nums.length ;
         int maxDiff = Integer.MIN_VALUE;

         for(int i =0 ;i<n-1 ;i++)
         { 
            int diff = nums[i+1] - nums[i] ;
            if(Math.abs(diff) > maxDiff)
            {
                maxDiff = Math.abs(diff);

            }
         }   
          
          int lastDiff =  Math.abs(nums[n-1] - nums[0]);
          
         if(lastDiff >  maxDiff)
         return lastDiff;
         else
         return maxDiff;

    }
}
