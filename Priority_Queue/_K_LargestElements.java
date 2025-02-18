import java.util.ArrayList;
import java.util.Arrays;

public class _K_LargestElements {
     public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        ArrayList<Integer> result=new  ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--)
        {
            if(result.size()==k)
            {
                break;
            }
            result.add(arr[i]);
        }
        return result;
    }
}
