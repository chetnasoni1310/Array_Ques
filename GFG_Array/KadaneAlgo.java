import java.util.*;
//import java.io.*;



public class KadaneAlgo{


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
// int max_end=arr[0];
// int max_sofar=arr[0];
// inhi ka rename h niche
int curr=0;
int tot=arr[0];
for(int i=0;i<n;i++){
    
        curr=curr+arr[i];
        if(curr>tot){
            tot=curr;
        }
        if(curr<0){
            curr=0;
        }
    
}
  System.out.println(tot);


sc.close();


}
}