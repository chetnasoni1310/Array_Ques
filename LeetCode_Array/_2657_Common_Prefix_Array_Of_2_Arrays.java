import java.util.HashSet;
import java.util.Set;

public class _2657_Common_Prefix_Array_Of_2_Arrays {
    
// 1st solution of using frequency array 
//2nd solution of using hashSet 

    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int n=a.length;
        int[]result=new int[n];
        int commonCount=0;
        int[]freq=new int[n+1];
        for(int i=0;i<n;i++)
        {
            freq[a[i]]++;
            freq[b[i]]++;
        if (freq[a[i]] == 2) { 
            // a[i] has appeared in B
                commonCount++;
            }
            if (freq[b[i]] == 2 && a[i] != b[i]) { 
                // b[i] has appeared in A (avoid double-counting)
                commonCount++;
            }
            result[i]=commonCount;
        }
        return result;
    }





    //2nd solution of using hashSet --->>>
    public int[] findThePrefixCommonArray___HashSET(int[] a, int[] b) 
    {  
        int n=a.length;

       Set<Integer> seta=new HashSet<>();
       Set<Integer> setb=new HashSet<>();
    //    Set<Integer> setcommon=new HashSet<>();
    // instead use --->>...

    int[]result=new int[n];
    int commonCount=0;

       for(int i=0;i<n;i++)
       {
        seta.add(a[i]);
        setb.add(b[i]);

       
        if(a[i]!=b[i] && seta.contains(b[i]) )
        {
            commonCount++;
        }
        if(setb.contains(a[i]) )
        {
            commonCount++;
        }
        result[i]=commonCount;
      
       }
      
 return result;
    }

}
