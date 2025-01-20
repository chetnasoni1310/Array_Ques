import java.util.Arrays;

public class Product_Array_Puzzle {
//pehle naive
//then prefix suffix product
//then meri approach mast siiiii maza aagya khud karke


    // Naive Approach
    static int[] productExceptSelf_1(int[] arr) {
        int n = arr.length;

        // Initialize the result array as 1
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 0; i < n; i++) {

            // Compute the product of all except arr[i]
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res[i] *= arr[j];
                }
            }
        }

        return res;
    }

    // Using prefix and suffix product
    static int[] productExceptSelf_2(int[] arr) {
        int n = arr.length;
        int[] prefProduct = new int[n];
        int[] suffProduct = new int[n];
        int[] res = new int[n];

        // Construct the prefProduct array
        prefProduct[0] = 1;
        for (int i = 1; i < n; i++)
            prefProduct[i] = arr[i - 1] * prefProduct[i - 1];

        // Construct the suffProduct array
        suffProduct[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--)
            suffProduct[j] = arr[j + 1] * suffProduct[j + 1];

        // Construct the result array using
        // prefProduct[] and suffProduct[]
        for (int i = 0; i < n; i++)
            res[i] = prefProduct[i] * suffProduct[i];

        return res;
    }

//Mast approach
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n=arr.length;
        int[]res=new int[n];
       
        int tot=1,count0=0,index=-1;
        boolean isZeroPresent=false;
        for(int i:arr)
        {  
            if(i!=0)
            {
            tot*=i;
            }
            if(i==0)
            {
                isZeroPresent=true;
                // index=i;   for each h toh index nhi aa skta vrna agar 
                 //count0 ki value 1 hoti toh appn sirf usko total prdt ke
                 //equal kr dete aur return res kr dete but yeh bhi sahi h 
                count0++;
            }
        }
        
        if(count0>1)
        {
            return res;
        }
        for(int i=0;i<n;i++)
        {   
            if(isZeroPresent)
           { 
            if(arr[i]!=0)
             {
                res[i]=0;
             }
             else{
                 res[i]=tot;
             }
           }
           else{
               res[i]=tot/arr[i] ;
           }
        }
        return res;
        
        
        
    }
}
