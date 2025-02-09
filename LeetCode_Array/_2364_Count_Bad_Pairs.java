import java.util.HashMap;

public class _2364_Count_Bad_Pairs {
/*   🔥 Must-Do LeetCode Problems
1️⃣ 560. Subarray Sum Equals K 🔥 (Most asked in FAANG!)
2️⃣ 523. Continuous Subarray Sum (Deals with prefix sum & mod concept)
3️⃣ 1512. Number of Good Pairs (Basic HashMap counting problem)
4️⃣ 1679. Max Number of K-Sum Pairs (Two-pointer + HashMap trick)
5️⃣ 2364. Count Number of Bad Pairs (Your question – concept of transforming conditions)
6️⃣ 1248. Count Number of Nice Subarrays (Prefix sum + sliding window)
7️⃣ 930. Binary Subarrays With Sum (Uses hashmap & prefix sum optimally)




🔥 Must-Do GFG Problems
1️⃣ Count pairs with given sum (Classic HashMap problem – must know!)
2️⃣ Subarray with given sum (Used in Walmart, Google, Amazon interviews!)
3️⃣ Largest subarray with 0 sum (Kadane’s + HashMap trick)
4️⃣ Zero Sum Subarrays (Variation of subarray sum problems)
5️⃣ Find the longest substring without repeating characters (Sliding window pattern)
*/
    public long countBadPairs(int[] nums) {
      
       int n=nums.length;
       if(n==1)
       {
        return 0;
       }
/* We will try to rearrange the eqaution because when we have 2 indices t's impossible
 to solve it without o(n2) if we are not using 2 pointers and 2 pointers will not work here
 so we will rearrange the equation in such a way that 
 nums[i]-i != nums[j]-j
 and also the counting of bad pairs is typical as compared to counting of good pairs
 So we will find good pairs , where the diff of index and number is same for any 2 indexes
 then we will find total pairs by 

  Total sum of n numbers = (n * (n+1))/2

  But here we only need sum upto n-1 so the formula goes reformulate to 
  Total sum of n-1 numbers = ( (n-1) *(n-1+1) )/2
                           =( (n-1) * (n)) /2 

    Total bad pairs = total pairs - total goodPairs 
     
       This hashmap will store the diff between index and the nums[index] mapped with frequency
       Then , we will calculate our desired diff y iterating over the array

     */
       HashMap<Integer , Long> Diff_Freq=new HashMap<>();
       long badPairs =0;
       for(int i=0;i<n;i++)
       {
           int diff=nums[i]-i;

          long freq= Diff_Freq.getOrDefault(diff , 0L);
         
        //   int totalPairs = ((i) *(i-1))/2;
          long totalPairs = i;
          long goodPairs = freq;
          
          badPairs += totalPairs - goodPairs ;
           /*
           Diff_Freq.put(diff ,Diff_Freq.getOrDefault(diff , 0)+1);
           can be written as  : 
           */
           Diff_Freq.put(diff ,freq+1L);
       }

      return badPairs ;
    }
}
