import java.util.HashMap;

public class Largest_SubArray_0_nd_1_Prefix_Sum  {
     public int maxLen(int[] arr) {
        // Your code here
        int n=arr.length;
        if(n<=1)
        {
            return 0;
        }
        int maxlen=0;
        
        int cs=0; //cummulative sum
        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i=0;i<n;i++)
        {   
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
            cs+=arr[i];
            if(cs==0)
            {
                maxlen=i+1;
            }
            if(set.containsKey(cs))
            {
                int sublen=i-set.get(cs);
                maxlen=Math.max(maxlen,sublen);
            }
            else{
            set.put(cs,i);
            }
            
        }
        return maxlen;
    }
}
