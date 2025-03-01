public class _2460_Applying_Operations_TO_ARray_SHIFTING_0s_To_END {
    public int[] applyOperations(int[] nums) {
        
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
           if(nums[i] !=0 && nums[i] == nums[i+1])
           {
             nums[i]*=2;
             nums[i+1]=0;
           }
        }
        /*  Working but may be incorrect logic 
        int i=0;
        int j=1;
        while(j<n)
        {
           boolean isSwapped=false;
            while(j<n && nums[i] == 0  )
            { 
                //Swap
               int temp=nums[i];
               nums[i] = nums[j];
               nums[j]=temp;

               j++;
               isSwapped=true;
            }
          
            if(isSwapped)
            {
                j--;
            }

            i++;
            j++;       
          
        }
           */

           int index=0;  // This will define where the element which is not zero
                      //  will be placed
        for(int i=0;i<n;i++)
        {
            if( nums[i] != 0)
            {
                /*That means we can place it to nums[index] position 
                because only 0 is prohibited there  */
               int temp=nums[i];
               nums[i] = nums[index];
               nums[index]=temp;
             
              index++;
            }
        }              
         return nums;
    }
}
