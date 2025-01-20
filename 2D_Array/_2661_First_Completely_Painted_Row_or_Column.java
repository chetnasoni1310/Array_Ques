import java.util.*;
//import java.io.*;



public class _2661_First_Completely_Painted_Row_or_Column {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        /*pehle mai hashmap mai positions ki value store karungi
        //matrix ko traverse krke
        //fir mai 2 arrays banaungi 
        //ek row ki size ka 
        //jo batayega ki particular row mai kitne element bhar gye hai 
        //similarly for column
        //fir mai array ko traverse krne shuru karungi 
        //jo jo numbers array mai h 
        //unki positions mai map se nikaal lungi 
        //arrays mai update krlungi 
        //if any row ka size =col ho jaye 
        //ya col ka size =row ho jaaye vhi stop krdenge
        //aur array ka index return krdenge
        */
        int m=mat.length;
        int n=mat[0].length;
        HashMap<Integer ,int[]> map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                map.put(mat[i][j] , new int[]{i,j});
            }
        }
         int[]row=new int[m];
         int[]col=new int[n];

         for(int i=0;i<arr.length;i++)
         {
            int[] positions=map.get(arr[i]);
            int roww=positions[0];
            int coll=positions[1];
            row[roww]++;
            col[coll]++;
            if(row[roww]==n || col[coll]==m)
            {
                return i;
            }
         }
         return -1;
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}