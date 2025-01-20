public class _1475_Discount_Price_Arr {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
       {   

           j=i+1;
           res[i]=arr[i];
           while(j<=n-1)
          {
          if(arr[j]<=arr[i] )
           {
              res[i]=arr[i]-arr[j];
              break;
           }
           else{
            j++;
           }
          }

       }
       return res;
    }
}
