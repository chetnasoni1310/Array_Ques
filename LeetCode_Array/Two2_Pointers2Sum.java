import java.util.*;
//import java.io.*;



public class Two2_Pointers2Sum {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int []arr={-4,-1,0,2,3,3,4};
int i=0;
int j=arr.length-1;
int target=5;
while(i<j){
    if(arr[i]+arr[j]==target){
        System.out.println(arr[i]+"+"+arr[j]);
        break;
    }
    else if(arr[i]+arr[j]<target){
        i++;
    }
    else{
        j--;
    }
}


sc.close();


}
}