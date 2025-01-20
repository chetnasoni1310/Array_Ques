import java.util.*;
//import java.io.*;



public class Matrix_Row_Column_SOrted {

    public static boolean matSearch(int mat[][], int x) {
        // your code here
    //     
    
   int n=mat.length;
    int m=mat[0].length;
    int i=0;
    int j=m-1;   //for top right corner
    while(i<n && j>=0)
    {  
        if(mat[i][j]==x)
        {
            return true;
        }
       else if(mat[i][j]<x)
        {
            i++;
        }
        else
        {
            j--;
        }
    }
    return false;
    
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}