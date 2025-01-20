public class _Equilibrium_Point_In_Array_Prefix_Sum {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n=arr.length;
         //pehle required approach hai
        //fir brute force approach hai
        //then better approach hai
       
               

//PrefixSum(arr[0 : pivot – 1]) + arr[pivot] + SuffixSum[pivot + 1: n – 1] = ArraySum 
// so, SuffixSum[pivot + 1: n – 1] = ArraySum – PrefixSum(arr[0 : pivot – 1]) 
// Here, pivot refers to the index that we are currently 
// checking for the equilibrium index.

//                 <<<<------->>>>
int tot=0;
for(int i:arr)
{
    tot+=i;
}
int presum=0;
for(int i=0;i<n;i++)
{
    int sufsum= tot-(presum +arr[i]);
    if(sufsum==presum)
    {
        return i;
    }
    
    presum+=arr[i];
    
}
return -1;

        
        
        
        // for(int i=0;i<n;i++)
        // {
        //     int lsum=0;
        //     for(int j=0;j<i;j++)
        //     {
        //         lsum+=arr[j];
        //     }
        //     int rsum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         rsum+=arr[j];
        //     }
            
        //     if(lsum==rsum)
        //     {
        //         return i;
        //     }
        // }
        // return -1;
        
        
        
        
        
        // pre-calculate lsum and rsum for all the indices and then check
        //whether they are equal or not
        
        // int[]presum=new int[n];
        // int[]sufsum=new int[n];
        
        // presum[0]=arr[0];
        // sufsum[n-1]=arr[n-1];
        
        // for(int i=1;i<n;i++)
        // {
        //     presum[i]=presum[i-1]+arr[i];
        // }
        
        
        // for(int i=n-2;i>=0;i--)
        // {
        //     sufsum[i]=sufsum[i+1]+arr[i];
        // }
        
        // for(int i=0;i<n;i++)
        // {
        // if(sufsum[i]==presum[i])
        // return i;
        // }
        // return -1;
        
        
        
 
    }
}
