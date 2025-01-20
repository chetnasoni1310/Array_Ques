import java.util.*;
//import java.io.*;



public class SecLargestInteger {

    public static int getSecondLargest(int[] arr) {
        // Code Here
       
        int n=arr.length;
        if(n==1)
        {
            return -1;
        }
        Arrays.sort(arr);
        int i=n-1;
        while(i>0)
        {
            if(arr[i]==arr[i-1])
            {
                i--;
            }
            else
            return arr[i-1];
        }
        return -1;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={10,10,10};
System.out.println(getSecondLargest(arr));

sc.close();


}
}