import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _2570_Merge_2D_Arrays_Sorted {
     public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
         
         int n1=nums1.length;
         int n2=nums2.length;

         int index1=0;
         int index2=0;
        
         List< int[] > mergeList = new ArrayList<>();

         while(index1<n1 && index2<n2)
         {
            if(nums1[index1][0] == nums2[index2][0])
            {  
               int key=nums1[index1][0];
               int value=nums1[index1][1]+nums2[index2][1];
               mergeList.add( new int[] { key , value });
               index1++;
               index2++;
            }
            else if(nums1[index1][0] < nums2[index2][0])
            {
               int key=nums1[index1][0];
               int value=nums1[index1][1]; 
               mergeList.add( new int[] { key , value });
               index1++;
            }
            else
            {
               int key=nums2[index2][0];
               int value=nums2[index2][1]; 
               mergeList.add( new int[] { key , value });
               index2++;    
            }
         } 

         while(index1<n1)
         {
            int key=nums1[index1][0];
            int value=nums1[index1][1]; 
            mergeList.add( new int[] { key , value });
            index1++;
         }
         while(index2<n2)
         {
            int key=nums2[index2][0];
            int value=nums2[index2][1]; 
            mergeList.add( new int[] { key , value });
            index2++;
         }

         int[][] mergeArray = new int[mergeList.size()][2];

         for(int i=0;i<mergeList.size();i++)
         {
            mergeArray[i] = mergeList.get(i);
         }

         return mergeArray ;
     }


    public int[][] mergeArrays_HasMap_Approach(int[][] nums1, int[][] nums2) {
        
        /*Key Observations : 
        1. Put nums1 in the hashmap 
        2. Then put nums2 in the map by getOrDefault Function
        3. After that convert that hashmap into the 2D array 
         */

        Map<Integer , Integer> map = new TreeMap<>();
        for( int[] row : nums1)
        {
            map.put(row[0] , row[1]);
        } 

        for(int[] row : nums2)
        {
            map.put(row[0] , map.getOrDefault(row[0] , 0) + row[1]);
        }

        int rows=map.size();
        int cols = 2 ;
        int[][] result= new int[rows][cols] ;
        int index=0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet())
        {
          result[index][0]= entry.getKey();
          result[index++][1]=entry.getValue(); 
        }
     return result;
    }
}
