import java.util.*;
//import java.io.*;



public class MissingNumbArray448 {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
    int i=0;
    while(i<arr.length){
        int correct_index=arr[i]-1;
        if(arr[i]<=arr.length && arr[i]!=arr[correct_index]){
            swap(arr,i,correct_index);
        }
        else{
            i++;
        }
}
for (int j = 0; j < arr.length; j++) {
    if(arr[j]!=j+1){
        result.add(j+1);
    }
}
return result;
}
public static void swap(int[]arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
// int n=sc.nextInt();
int[]arr={4,3,2,7,8,2,3,1};
// // int start=Integer.MAX_VALUE;
// for (int i = 0; i <n ; i++) {
//     arr[i] = sc.nextInt();
//     // if(arr[i]<start){
//     //     start=arr[i];
//     // }
// }
List<Integer> result = new ArrayList<>();

result=findDisappearedNumbers(arr);
System.out.println(result);

sc.close();
}
}