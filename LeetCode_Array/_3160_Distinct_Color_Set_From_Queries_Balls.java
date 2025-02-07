import java.util.HashMap;
import java.util.HashSet;

public class _3160_Distinct_Color_Set_From_Queries_Balls {

//Try these first then this ques 
    // 380. Insert Delete GetRandom O(1)
    // 381. Insert Delete GetRandom O(1) - Duplicates allowed
    // 2349. Design a Number Container System
    // 2353. Design a Food Rating System
    public int[] queryResults(int limit, int[][] queries) {

      

        /*HashMap aur HashSet dono bhi use kr skte hai 
        kyunki dekh distinct ko dekhte hi dimaag set aata hai 
        surely use hoga
        fir uss bichare akele se kaam nhi bann payega toh map ki entry krwani padegi 


        ab map mai (ball , color) store krwana
           set mai (distinct color) store krwana
    ek aur map mai (color , freq) store krwana kyunki kya pata voh same
     color kisi aur ka bhi ho 
     toh agar uski freq 1 hai mtlb voh color sirf ek ka hi remove krdenge set se
     aur agar 1 nahi hai mtlb yaa toh voh exist hi nhi krta 
                              yaa kisi aur ka bhi same color hai
                              toh remove nhi krskte hai  

        agar map mai pehle se voh ball nahi hai toh usko bhejo
        agar pehle se hai toh uske old color ko store krwa lena kahin
        aur fir new color ko put krdena
        fir set mai se old color delete/remove 
        and new color add krdena
        then count krna set ki size for i^th query and then add it to result array

        */

          //Result array bana lia
        int n=queries.length;
        int[]result=new int[n];
       
       HashMap<Integer, Integer> ball_and_color=new HashMap();
       HashMap<Integer,Integer> freqOfColors=new HashMap<>();
       HashSet<Integer> color=new HashSet<>();
      int i=0;
       for(int[]query:queries)
       {
        if(ball_and_color.containsKey(query[0]))
        {   
           
            int oldColor=ball_and_color.get(query[0]);
            if(freqOfColors.get(oldColor)==1)
           {
             color.remove(oldColor);
           }
             freqOfColors.put(oldColor , freqOfColors.get(oldColor)-1);
        }   
            
            ball_and_color.put(query[0],query[1]);
             freqOfColors.put(query[1] ,freqOfColors.getOrDefault(query[1],0)+1);
            color.add(query[1]);
            result[i++]=color.size();
       }
       return result;
    }
}
