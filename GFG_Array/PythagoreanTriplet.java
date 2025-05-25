import java.util.Arrays;

public class PythagoreanTriplet{
    public static void main(String[] args) {
        
    }
      boolean pythagoreanTriplet(int[] arr) 
      {
    /* No need for hashset 
       Use the 2 pointer approach
       Modify the array inplace by replacing them with their squares as because 
       we only need their squares during program 
       Fix 1 element as c 
       and then check if there exist something a and b 
       if nnot then move the pointers according to the need 
       We will start it from end because c will be greater than a and b obviously 
       
     */
     
     int n=arr.length;
     for(int i=0; i<n ; i++)
     {
         arr[i] = arr[i] * arr[i] ;
     }
     
     
     Arrays.sort(arr);
     
     
     for(int i=n-1 ; i>=2 ;i--)
     {
         int a_left = 0 ;
         int b_right =  i-1 ;
         
         while(b_right > a_left)
         {
         int sum = arr[a_left] + arr[b_right];
         
         if(sum == arr[i])
         {
             return true;
         }
         else if(sum > arr[i])
         {
             b_right-- ;
         }
         else
         {
             a_left++;
         }
     }
     }
     return false;
}
}