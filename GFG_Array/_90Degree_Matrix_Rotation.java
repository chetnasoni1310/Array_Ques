import java.util.*;
//import java.io.*;



public class _90Degree_Matrix_Rotation {

    static void rotateby90(int mat[][]) {
        // code here
        //Taking the transpose of matrix
        int n=mat.length;
        // unke indexes ki value se intuition aa skta hai 
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat[0].length;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        
        //Reversing the column to obtain desired formation
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int temp = mat[i][j];
                mat[i][j] = mat[n - 1 - i][j];
                mat[n - 1 - i][j] = temp;
            }
        }
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}