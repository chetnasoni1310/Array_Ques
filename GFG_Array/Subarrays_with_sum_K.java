import java.util.*;
//import java.io.*;



public class Subarrays_with_sum_K{
    public int countSubarrays(int arr[],int k) 
    {
        // code here
        int n=arr.length;
        int prefixSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
        
//         If the hashmap isn’t initialized with {0: 1},
// subarrays that start at index 0 and sum to 𝑘
//  would not be detected, as there would be no entry for prefix_sum - k when 
// prefix_sum = k 
         
         
        int count=0;
        for(int i:arr)
        {
            prefixSum +=i;
           if(map.containsKey(prefixSum -k ))
           {
               count+=map.get(prefixSum -k );
           }
           map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
            
        }
        return count;
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}