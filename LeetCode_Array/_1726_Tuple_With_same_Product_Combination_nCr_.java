import java.util.HashMap;

public class _1726_Tuple_With_same_Product_Combination_nCr_ {
    public int tupleSameProduct(int[] nums) {
        
        /**                         HARD 
        Agar koi condition nhi hoti toh total ways of arranging 
        [a,b,c,d] = 4! =24
  
        but humein unko pair mai rkhna hai toh ese hoga ::
        (2 ways for (a,b))×(2 ways for (c,d))×(2 ways to swap pairs) = 8  
       We are only rearranging these two pairs, not the individual elements
       within each pair.
       
  
       toh jab hum hashmap mai product aur uski freq store krenge toh 
       jitni freq repeat hori hogi  usko 8 se multiply(x)  kr denge 
  
       If a product appears k times, then we can form:
      Ways to pick two pairs = k
                                C  = k!/2!*(k-2)!
                                 2
   
      WKT , Each pair contributes 8 permutations to the final count 
      For each product that appears k times, add : 8*(k
                                                       C = k!/2!*(k-2)!
                                                         2)
  
         */   
  
        int n=nums.length;
        HashMap<Integer , Integer> product= new HashMap<>();
        //Ismai mai product aur unki freq store krungi 
  
        for(int i=0;i<n-1;i++)
        {
          for(int j=i+1;j<n;j++)
          {
              int ProductValue=nums[i]*nums[j];
             product.put(ProductValue ,product.getOrDefault(ProductValue,0)+1 );
          }
        }
        
        int totalTuples=0;
        for(Map.Entry<Integer , Integer> entry : product.entrySet())
        {
          //    Integer key=entry.getKey();
          //    Integer value=entry.getValue();
          int k=entry.getValue() ;
          if(k > 1)
          {
                int combination= (k *(k-1))/2 ;   //nCr wala formula 
                totalTuples+= 8*combination ;     // jaise updar bataya 
          } 
        }
  
        return totalTuples;
      }
}
