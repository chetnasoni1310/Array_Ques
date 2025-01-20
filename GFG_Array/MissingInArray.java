import java.util.*;
//import java.io.*;



public class MissingInArray {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int arr[] = new int[n-1];
for(int i=0; i<n-1; i++){
   arr[i]=sc.nextInt();
}
// for(int i=0; i<n-2; i++){
//     if(arr[i+1]==arr[i]+1){
//         continue;
//     }
//     else{
//         System.out.println(arr[i]+1);
//     }
// }
int sum=(n * (n+1))/2 ;
int sum2=0;
for(int i=0; i<n-1; i++){
    sum2+=arr[i];
}
int missing=sum-sum2;
System.out.println(missing);
sc.close();


}
}