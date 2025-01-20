import java.util.*;
//import java.io.*;



public class SumofMid {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
   int arr1[]=new int[n1];
   int arr2[]=new int[n2];
   int arr[]=new int[n1+n2];
  for(int i=0; i<n1; i++){
    arr1[i]=sc.nextInt();
  }
  for(int i=0; i<n1; i++){
    arr2[i]=sc.nextInt();
  }
  for(int i=0; i<n1; i++){
    arr[i]=arr1[i];
  }
  for(int i=0; i<n2; i++){
    arr[i+n1]=arr2[i];
  }
  Arrays.sort(arr);
  System.out.println(Arrays.toString(arr));
 int mid1=arr.length /2;
 int mid2=(arr.length /2) -1;
  System.out.println(arr[mid1] +arr[mid2]);

sc.close();


}
}