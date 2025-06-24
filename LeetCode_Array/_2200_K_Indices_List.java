import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2200_K_Indices_List {
public List<Integer> findKDistantIndices_IstMethod(int[] nums, int key, int k) {
        /***Key Observations :
        1. First of all search for key in the array 
        2.if we found key add the left k elements in the list if exists
        3.then the element itself
        4.then the right k elements if they too exist 
        5.if(size of list == size of arr) then return from that 
          otherwise 
          traverse the whole array 
          


          ***Dont add duplicate values in the list 
          ***If only one element then return 0 in the list 
          ***If k==n then return list upto k whole numbers  
          */
          int n= nums.length;
          List<Integer> result = new ArrayList<>();
          Set<Integer> visited = new HashSet<>();
          
          if(n==1)
          {
            result.add(0);
            return result;
          }



          if(k==n)
          {
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
          }


         for(int i=0;i<n;i++)
         {  
            if(nums[i]==key)
            {
                int left = Math.max(0,i-k);
                int right = Math.min(n-1 , k+i);

                for(int j=left;j<=right;j++)
                {
                    if(visited.add(j))
                    result.add(j);
                }

                if(result.size() == n)
                {  Collections.sort(result);
                return result;}

            }          
         }

         Collections.sort(result);
        return result;
    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
    int n = nums.length;
    List<Integer> keyIndices = new ArrayList<>();
    Set<Integer> resultSet = new HashSet<>();

    // Pass 1: Find all indices where nums[i] == key
    for (int i = 0; i < n; i++) {
        if (nums[i] == key) {
            keyIndices.add(i);
        }
    }

    // Pass 2: For each key index, mark all i such that |i - j| <= k
    for (int j : keyIndices) {
        int start = Math.max(0, j - k);
        int end = Math.min(n - 1, j + k);

        for (int i = start; i <= end; i++) {
            resultSet.add(i);
        }
    }

    // Convert set to sorted list
    List<Integer> result = new ArrayList<>(resultSet);
    Collections.sort(result);
    return result;
}
}
