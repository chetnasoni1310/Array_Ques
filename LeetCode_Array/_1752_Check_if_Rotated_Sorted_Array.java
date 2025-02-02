import java.util.Arrays;

public class _1752_Check_if_Rotated_Sorted_Array {
    public boolean check_Brute_Force(int[] nums) {
              /**
        Brute force method 
        pehle ek offset define kro jo 0 to n-1 jayega 
        fir jaha offset hai vha tk ke number ko dusre array mai last 
        position se daaldo
        bacha hua part start position se daaldo(See editorial if u can't
                                                visualise)
        fir check karo jo array naya banaya voh sorted hai ki nahi 
        (i-1<i)
         */

         int[]check=new int[nums.length];
         int offset=0;
         for(offset=0;offset<nums.length;offset++)
         {
            int currIndex=0;
         for(int i=offset;i<nums.length;i++)
         {
             check[currIndex++]=nums[i];
         }
         for(int i=0;i<offset;i++)
         {
            check[currIndex++]=nums[i];
         }

         boolean isSorted=true;
         for(int i=0;i<nums.length-1;i++)
         {
            if(check[i]>check[i+1])
            {
                isSorted=false;
                break;
            }
         }
         if(isSorted)
         {
            return true;
         }
         }
             return false;
    }
      public boolean check_Brute_Force_II(int[] nums) {
        /**
        in this approach i will create a copy of array and sort it
        then i will hypothetically rotate the array using cyclic array
        and check for each offset value if the elements are equal to 
        sorted array
        if yes at any point return true
        if all offset values are covered then return false */
        int n=nums.length;
        int[] sorted=nums.clone();
        Arrays.sort(sorted);

        for(int offset=0;offset<n;offset++)
        {  
            
            boolean isSorted=true;
            for(int index=0;index<n;index++)
            {
                if(nums[(index+offset) % n]!=sorted[index])
                { 
                  isSorted=false;  
                  break;
                }
            }
           if(isSorted)
           {
            return true;
           }
        }
        return false;
      }
      public boolean check_Optimal(int[] nums) {
            int n=nums.length;
            if(n<=1)
            return true;

           int min=0;
            for(int i=1;i<n;i++)
            {
                if(nums[min] > nums[i])
                {
                    min=i;
                }
            }
            int inversionCount=0;
            for(int i=0;i<n;i++)
            {
              if(nums[(i+min)%n]>nums[(i+1+min)%n])
               {
                inversionCount+=1;
                if(inversionCount>1)
               {
                return false;
               }
               }
            }
                return true;
        }
        public boolean check(int[] nums) {
            int n=nums.length;
            if(n<=1)
            return true;
            int inversionCount=0;
            for(int i=0;i<n-1;i++)
            {
              if(nums[i]>nums[(i+1)])
               {
                inversionCount+=1;
               }
               
            } 
             if (nums[0] < nums[n - 1]) 
                {
                   ++inversionCount;
                }   
          if(inversionCount>1)
               {
                return false;
               }

                return true;
        }
}
