import java.util.*;
//import java.io.*;



public class MaxSumPath2Arrays {
    public static int max(int x, int y) 
             { return (x > y) ? x : y; }
        public static int maxPathSum(List<Integer> ar1, List<Integer> ar2) {
            // code here
             int m=ar1.size();
             int n=ar2.size();
            int i = 0, j = 0;
            int result = 0, sum1 = 0, sum2 = 0;
    
            
            while (i < m && j < n) {
                if (ar1.get(i)< ar2.get(j))
                    sum1 += ar1.get(i++);
    
                else if (ar1.get(i) > ar2.get(j))
                    sum2 += ar2.get(j++);
    
                else {
                    
                    result += max(sum1, sum2) + ar1.get(i);
    
                    sum1 = 0;
                    sum2 = 0;
    
                   
                    i++;
                    j++;
                }
            }
    
            while (i < m)
                sum1 += ar1.get(i++);
    
            while (j < n)
                sum2 += ar2.get(j++);
    
            result += max(sum1, sum2);
    
            return result;
        }
    
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                ArrayList<Integer> ar1 = new ArrayList<Integer>();
                ArrayList<Integer> ar2 = new ArrayList<Integer>();
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                for(int i = 0; i < n1; i++){
                      ar1.add(sc.nextInt());
                }
                System.out.println(ar1);
                for(int i = 0; i < n2; i++){
                      ar2.add(sc.nextInt());
                }
                System.out.println(ar2);

                System.out.println(maxPathSum(ar1,ar2));
                sc.close();
            }
        
    }
