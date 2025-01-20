import java.util.*;
//import java.io.*;



public class ArrayDuplicate {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for (int i=0; i<n; i++){
    arr[i]=sc.nextInt();
}
n=arr.length;
boolean visited[]=new boolean[arr.length];
int count=0;
ArrayList<Integer>list=new ArrayList<>();
Arrays.fill(visited,false);
for(int i=0; i<n; i++)
{
    if(visited[i]==true){
        continue;
    }
    else {
        count=1;
          for(int j=i+1; j<arr.length; j++){
          if(arr[i]==arr[j]){
          visited[j]=true;
          count++;
        }
    }
       if(count>1){
       list.add(arr[i]);
       }
       System.out.println(arr[i]+" : "+count);
    }
}
sc.close();
Collections.sort(list); 
if(list.size()>0){
    // return list;
    System.out.println(list);
  }
  else{
    list.add(-1);
    System.out.println(list);
    // return -1;
  }

}
}