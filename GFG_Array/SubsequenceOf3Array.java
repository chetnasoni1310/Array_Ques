import java.util.*;
//import java.io.*;



public class SubsequenceOf3Array {


public static void main(String[] args) {

Scanner sc =new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    List<Integer>list= find3Numbers(arr);
    if(list.size()==0){
        System.out.println("0");
    }
    else if(list.size()==3){
        System.out.println("1");
    }
    else{
        System.out.println("-1");
    }
}


sc.close();
}
  //correct solution niche hai iska 
public static List<Integer> incorrectfind3Numbers(int[] arr) {
    // code here
    
    ArrayList<Integer> list=new ArrayList<Integer>();
   
    if(arr.length<3){
        return list;
    }
  
    int first=Integer.MAX_VALUE;
    int second=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        int num=arr[i];
        if(num<=first){
            first=num;
        }
        else if(num<=second){
            second=num;
        }
        else{
            list.add(first);
            list.add(second);
            list.add(num);
            return list;
        }
    }
   
     return list;

}







           //coorect solution-------------->>>>>>>>>>>>>>>>
           public static List<Integer> find3Numbers(int[] arr) {
            // code here
      int n = arr.length;
    
            // Traverse the array to find the triplet
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    if (arr[i] < arr[j]) {
                        for (int k = j + 1; k < n; k++) {
                            if (arr[j] < arr[k]) {
                                // Return the triplet as a list
                                return Arrays.asList(arr[i], arr[j], arr[k]);
                            }
                        }
                    }
                }
            }
    
            // If no such triplet is found, return an empty list
            return new ArrayList<>();
    }
}