import java.util.HashSet;
import java.util.Set;

public class _3375_MinOperation_to_make_Values_Equal_TO_K {
 public int minOperations(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();
        int count=0;

        for(int i : nums)
        {
            boolean isPresent = set.add(i);
            if(i<k)
            {
                return -1;
            }
            else if(isPresent && i>k)
            {
              count++;
            }

        }
       return count;
        
    }
}
