import java.util.*;
//import java.io.*;



public class Count_No_OF_SubArrays_With_given_XOR{

   public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={4,2,2,6,4};
int k=6;
int n=arr.length;
HashMap<Integer,Integer> freq=new HashMap<>();
for(int i=0;i<n;i++)
{  
    
    freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
    
}
int result=0;
for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    int value = entry.getValue(); // Get the value (frequency)
    if (value % 2 != 0) { // Check if the frequency is odd
        result ^= entry.getKey(); // XOR the key
    }

}
if(result!=k)
{
    System.out.println("Not"+result);;
}
else{
    System.out.println("Yes"+result);
}


sc.close();


}
}