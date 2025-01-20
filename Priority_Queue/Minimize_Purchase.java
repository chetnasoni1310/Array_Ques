import java.util.Arrays;
import java.util.PriorityQueue;

public class Minimize_Purchase{
      public int minimizeThePurchase(int[] price, int k, int x) {
        // code here
        int n=price.length;
        Arrays.sort(price);
       
       
       //Greedy Approach 
    //  for(int i=n-1;i>=0 && k>0;i--)
    //  {
    //      int no_Of_Coupan_Req=Math.min(k ,(price[i]+x-1)/x );
    //      price[i]=Math.max(0,price[i]- (x *no_Of_Coupan_Req));
    //      k-=no_Of_Coupan_Req;
    //  }
    //   int tot=0;
    //   for(int i:price)
    //   {
    //       tot+=i;
    //   }
    //   return tot;
    
    
    
    
    //Priority Queue and Heap
    
   PriorityQueue<int[]> maxPrice=new PriorityQueue<>((a,b)->b[1]-a[1]);
   //queue banadi
   //ismai bharte hai values
   for(int i=0;i<n;i++)
   {
       int reduction_Price=Math.min(price[i],x);
       //jo bhi dono mai se chota hoga utni hi price kamm ho payegi
       maxPrice.offer(new int[]{i,reduction_Price});
   }
   
   //Jiski price sabse kamm hone wali hogi voh 1st number pe retrieve hoga
   //toh fir karo aur uski price kamm karo 
   //start
  while(k>0 && !maxPrice.isEmpty())
   {
       int[] max_Reduced_Cost= maxPrice.poll();
       int i=max_Reduced_Cost[0];
       int cost=max_Reduced_Cost[1];
       price[i]=price[i]-cost;
       k--;
       if(price[i]>0)
       {
           maxPrice.add(new int[]{i ,Math.min(price[i],x)});
       }
   }
   int tot=0;
   for(int i:price)
   {
       tot+=i;
   }
   return tot;
    
    }
}