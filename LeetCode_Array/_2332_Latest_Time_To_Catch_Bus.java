import java.util.Arrays;

public class _2332_Latest_Time_To_Catch_Bus {
     public static void latestTimeCatchTheBus(int[] buses, int[] passengers, 
    int capacity) 
    {
        Arrays.sort(buses);
        int b=buses.length;
        Arrays.sort(passengers);
        int p=passengers.length;
        int[]cap=new int[b];
        int i=0;
        for(i=0;i<p;i++)
        {
            for(int j=0;j<b;j++)
            {  
                if(cap[j]!=capacity)
                {
                if(passengers[i]<=buses[j])
                {  
                   System.out.println("Bus : "+j+"Passenger :"+i);
                   cap[j]+=1;
                   break;
                }
                else 
                {
                    continue;
                }
                }

            }
            if(cap[b-1]==capacity)
            {
                break;
            }
        }
     
        System.out.println(i);
        while(i>0 && passengers[i]-1 == passengers[i-1])
        {
            i--;
        }
       System.out.println( passengers[i]-1);
    }

    public static void main(String[] args) {
        int[]buses={20,30,10};
        int[]passengers={19,13,26,4,25,11,21};
        int capacity=2;

        latestTimeCatchTheBus(buses,passengers,capacity);
    }
}
