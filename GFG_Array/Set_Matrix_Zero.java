import java.util.*;
//import java.io.*;



public class Set_Matrix_Zero
 {

    public void setMatrixZeroes(int[][] mat) {
        
        int n=mat.length;
        int m=mat[0].length;
        boolean isr1zero=false;
        boolean isc1zero=false;
        
        
        for(int i=0;i<m;i++)
        {
            if(mat[0][i]==0)
            {
                isr1zero=true;     //row0 marker
                break;
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            if(mat[i][0]==0)
            {
                isc1zero=true;      //col0 marker
                break;
            }
        }
        
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    mat[i][0]=0;      //row i marker
                    mat[0][j]=0;       //col j marker
                }
            }
        }
        
        
        
        // for(int i=0;i<n;i++)
        // {
        //     if(mat[i][0]==0)
        //     {
        //         for(int j=0;j<m;j++) //poori row i ko zero krdia
        //         {
        //             mat[i][j]=0;
        //         }
        //     }
        // }
        
        
        //  for(int i=0;i<m;i++)
        // {
        //     if(mat[0][i]==0)
        //     {
        //         for(int j=0;j<n;j++)
        //         {
        //             mat[j][i]=0; //poori col i ko zero kr dia
        //         }
        //     }
        // }
        
        
                for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if(isc1zero)
        {
            for(int i=0;i<n;i++) //1st col ko handle kia
            {
                mat[i][0]=0;
            }
        }
        
        
         if(isr1zero)
        {
            for(int i=0;i<m;i++)  //1st row ko 
            {
                mat[0][i]=0;
            }
        }
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}