import java.util.*;
//import java.io.*;



public class _2554_MaxSum_Banned_array {

    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:banned)
        {
            set.add(i);
        }
        int using=0;
        int max=0;
        for(int i=1;i<=n;i++)
        {
            if(set.contains(i))
            {
               continue;
            }
            else 
            {
                max+=i;
                if(max<=maxSum)
                {
                    using++;
                }
            }
        }
        return using;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}