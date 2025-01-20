import java.util.*;
//import java.io.*;



public class  SortedSubArray1574 {

   static public int findLengthOfShortestSubarray(int[] arr) {
    int n=arr.length;
        if(arr.length==1)
        {
            return 0;
        }
        int left_pointer=0;
        int right_pointer=arr.length-1;
        while(left_pointer<n-1 && arr[left_pointer]<=arr[left_pointer+1])
        {
            
                   left_pointer++;
            
        }
       /***************IMPPP */ 
       if (left_pointer == n - 1) return 0;
        while(right_pointer>0 && arr[right_pointer-1]<=arr[right_pointer])
        {
           
                right_pointer--;
            
        }
        int result=Math.min(n-left_pointer-1,right_pointer);
      int i=0,j=right_pointer;
      while(i<=left_pointer && j<n)
      {
        if(arr[i]<=arr[j])
        {
            result=Math.min(result,j-i-1);
            i++;
        }
        else
        {
            j++;
        }
        
      }




        return result;
       
    }
public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
int[]arr={1,2,3,10,4,2,3,5};
System.out.println(findLengthOfShortestSubarray(arr));


sc.close();


}
}