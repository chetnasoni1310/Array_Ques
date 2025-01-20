import java.util.*;
//import java.io.*;



public class SubArrays {
//  static List<List<Integer>> list=new ArrayList<>();
static List<List<Integer>> subarr(int[]arr) {
    List<List<Integer>> outer = new ArrayList<>();

    outer.add(new ArrayList<>());
    for(int i=0;i<arr.length;i++){
         
        int n=outer.size();
        for (int index = 0; index < n; index++) {
            List<Integer> internal=new ArrayList<>(outer.get(index));
            internal.add(arr[i]);
            outer.add(internal);
        }
    }
    return outer;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int []arr={1,2,3};
List<List<Integer>> ans=subarr(arr);
System.out.println(ans);

sc.close();


}
}