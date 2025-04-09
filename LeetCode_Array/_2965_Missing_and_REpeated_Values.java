import java.util.TreeMap;

public class _2965_Missing_and_REpeated_Values {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        /*Key observation:
        1. USe a tree map for storing the values in ascending order 
        2.Then choose whoose freq is 2
        3. Then traverse the tree map for missing part  */

        int n=grid.length;
        int totalNum=n*n;

        TreeMap<Integer , Integer> map=new TreeMap<>();
        int[]result=new int[2];
        for(int[] row : grid)
        {
            for(int num : row)
            {
                if(map.containsKey(num))
                {
                    result[0]=num;
                }
                map.put(num , map.getOrDefault(num , 0)+1);
            }
        }
       
       
        for (int i = 1; i <= totalNum; i++) {
        if (!map.containsKey(i)) {
            result[1] = i; // The missing number
            break;
        }
        }
        return result;
    }
}
