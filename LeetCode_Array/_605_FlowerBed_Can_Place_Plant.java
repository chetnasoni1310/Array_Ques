public class _605_FlowerBed_Can_Place_Plant {
 public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /**First of all I will start decrementing n
        If there occurs 3 zeroes in a row then the middle one can be 
          planted
          then n--
          if n==0 then true 
          if array reaches end then false 
           */
          if(n==0)
          {
            return true;
          }
         int len = flowerbed.length;
         int i=0;
         while(i<len)
         {
            if(flowerbed[i] == 1)
            {
                i=i+2;
            }
            else
            {  
                int prev = (i==0) ? 0 : flowerbed[i-1] ;
                int next = (i==len-1) ? 0 : flowerbed[i+1] ; 
                
                if(prev==0 && next==0)
                {
                    n--;
                    flowerbed[i]=1;
                    if(n==0)
                    {
                        return true;
                    } 
                    i=i+2;
                }
                else
                i++;
            }
        }
        return false;
    }
}
