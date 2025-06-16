public class _2016_Max_Diff_2_elements {
     public int maximumDifference_brute_force(int[] nums) {
        //Brute Force
        int n= nums.length;
        int diff = -1;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] < nums[j])
                {
                    diff = Math.max( diff , nums[j] - nums[i] );
                }
            }
        }

        return diff;
    }

 public int maximumDifference(int[] nums) {
    /*Look for patterns like “minimum so far” or “maximum so far”.
    "What is the smallest number I've seen so far before current element?"

    Dekh min so far nikaal 
    fir agar curr element usse bada hai toh unka diff le aur agar nhi h bada toh 
    min so far update ho jaayega 

    fir traverse krte jaa krte jaa result aa jaayega 

    */
    int n= nums.length;

    int diff = -1;
    int min_so_far = nums[0];


    for(int i=1;i<n;i++)
    {
       if( nums[i] <= min_so_far)
       {
        min_so_far = nums[i];
       }
       else
       {
        diff = Math.max( diff , nums[i] - min_so_far);
       }
    }
    return diff;
}
}
