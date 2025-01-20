import java.util.*;
//import java.io.*;



public class One_DArray_to_2D_Array  {

    public static int[][] construct2DArray(int[] arr, int m, int n) {
        if(!(m*n==arr.length)){
            return new int[][]{};
        }
        int[][]neew=new int[m][n];
        
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                        neew[i][j]=arr[i*n+j];
                }
            }
            return neew;
       
    }
    public static void printIntMatrix(int[][] matrix) {  
        for (int[] row : matrix) {  
            for (int value: row) {  
                System.out.print(value + " ");  
            }  
            System.out.println();  
        }  
    }  


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr1={1,2,3,4};
int m1=2,n1=2;
int neew[][]=construct2DArray(arr1,m1,n1);
printIntMatrix(neew);


sc.close();


}
}