import java.util.ArrayList;
import java.util.List;

public class _2523_PrimeNumbers_inRange_Left_to_Right {
   public int[] closestPrimes(int left, int right) {
        /*Key Observations : 
        1. First of all i will generate a list of all the prime numbers in the 
          range [left right] 
        2. After this i will get the first 2 intergers of the list
        3. Edge Case - If list contains <2 numbers then return [-1 -1]
           */

        List<Integer> primeNumbers = allPrimeInRangeList(left , right);
        if(primeNumbers.size() < 2)
        {
            return new int[] { -1 ,-1};
        }   
        
        int minDiff=Integer.MAX_VALUE;
        int num1 =-1;
        int num2 =-1; 

       for(int i=1 ;i<primeNumbers.size() ;i++)
       {
         int diff = primeNumbers.get(i) - primeNumbers.get(i-1);
         if(diff < minDiff )
         {
            minDiff = diff;
            num1 = primeNumbers.get(i-1);
            num2 = primeNumbers.get(i);
         }
       }
        return new int[] { num1 , num2}; 
    }
  
  private List<Integer> allPrimeInRangeList(int start , int end)
  {
    List<Integer> primeNumbers = new ArrayList<>();

    if(end<=2)
    {
        return primeNumbers;
    }
    
    int START = Math.max(start , 2);  
    //Agar 2 se chota hua toh 


    for(int i=START ; i<=end ; i++)
    {
        if(isPrime(i))
        {
            primeNumbers.add(i);
        }
    }
    return primeNumbers;
  }

  private boolean isPrime(int num)
  {
    if(num < 2)
    return false;

    if(num==2 || num==3)
    {
        return true;
    }

    if(num%2 ==0 || num%3==0)
    return false;


    for(int i=5 ; i*i<=num ;i+=6)
    {
        if(num % i ==0 || (num % (i+2)) ==0)
        return false;
    }
    return true;
  }
}
