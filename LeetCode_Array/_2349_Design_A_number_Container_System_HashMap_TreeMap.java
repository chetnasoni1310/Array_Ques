import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class _2349_Design_A_number_Container_System_HashMap_TreeMap {


    //Same as 3160 problem and this <-- contains more such problem link

    class NumberContainers 
    {

    HashMap<Integer, Integer> Hashmap;  //Index -> Number
    TreeMap<Integer, TreeSet<Integer> >Treemap; //Number to Index

    public NumberContainers() {
        Hashmap = new HashMap<>();
        Treemap = new TreeMap<>();
    }
    
    public void change(int index, int number) 
    {
        if(Hashmap.containsKey(index))
        {   
            int oldNumber=Hashmap.getOrDefault(index, -1);

           if(oldNumber!=number)
           {
            //agar change hua hai tbhi remove add kro vrna nhi
            if(oldNumber!=-1)
            {
                Treemap.get(oldNumber).remove(index);

                if(Treemap.get(oldNumber).isEmpty())
                {
                    Treemap.remove(oldNumber);
                }
            }
           }
       

        Hashmap.put(index,number);

        /*Before adding an index to a number in the numberToIndicesMap, 
        you need to ensure that there is already a TreeSet available
         for that number. If it's the first time this number is being 
         encountered, this line will create a new TreeSet and associate
          it with the number in the map.
         */
        Treemap.putIfAbsent(number,new TreeSet<>());
        Treemap.get(number).add(index);
    }
}
    public int find(int number) {
        if(!Hashmap.containsValue(number))
        {
            return -1;
        }
        else
        {
            return Treemap.get(number).first();
        }
    }
  
}
}
