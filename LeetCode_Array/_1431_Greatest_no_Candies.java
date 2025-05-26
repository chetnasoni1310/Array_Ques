import java.util.ArrayList;
import java.util.List;

public class _1431_Greatest_no_Candies {
 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        /* first of all i will find the max value in candies array 
         then i will traverse the array and start comparing 
          Index candy + extra candy with the max candy value of array 
          and fill the boolean list accordingly 
           */

           List<Boolean> result = new ArrayList<>();


           int n= candies.length;
           int max = Integer.MIN_VALUE;


           for(int i : candies)
           {
             if(i > max)
             {
                max = i ;
             }
           }

           for(int i =0 ;i<n ;i++)
           {
             if(candies[i] + extraCandies >= max )
             {
                result.add(true);
             }
             else
             result.add(false);
           }

           return result;
    }
}
