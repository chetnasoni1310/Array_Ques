import java.util.*;
//import java.io.*;



public class AP_3_Length_Subarray_ {

    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++)
            {
                if(nums[i]+nums[i+2]==nums[i+1]/2.0)
                {
                    count++;
                }
            }
        return count;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}