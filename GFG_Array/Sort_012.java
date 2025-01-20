import java.util.*;
//import java.io.*;



public class Sort_012 {
    public void sort012(int[] arr) {
        // code here
      int low=0,mid=0,high=arr.length-1;
      while(mid<=high)
      {
          if(arr[mid]==0)
          {
              int temp=arr[mid];
              arr[mid]=arr[low];
              arr[low]=temp;
              mid++;
              low++;
          }
          else if(arr[mid]==2)
          {
              int temp=arr[mid];
              arr[mid]=arr[high];
              arr[high]=temp;
              high--;
          }
          else
          {
            mid++;  
          }
      }
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}