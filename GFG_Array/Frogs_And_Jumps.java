import java.util.HashSet;

public class Frogs_And_Jumps {

      public int unvisitedLeaves_1st_Optimized(int n, int leaves, int frogs[]) {
          
          /* Key Observation : 
           1. If the jump strength of any frog is 1 then return 0 
           2. We will make a boolean visited array for leaves
           3. We will store all unique jump strengths in a HashSet
           4. We will check whether any one is repeating it or not 
           5. Return the count
           */
           
           HashSet<Integer> unique_jumpStrength=new HashSet<>();
           boolean[]visited=new boolean[leaves+1];
           
           for(int i=0;i<n;i++)
           {
               if(frogs[i] <= leaves)
               {
                   unique_jumpStrength.add(frogs[i]);
               }
           }
           
           //Imp Condition 
           if(unique_jumpStrength.contains(1))
           return 0;
           
           
           int count=0;
           for(int jumpStrength : unique_jumpStrength)
           {
               for(int j=jumpStrength;j<=leaves;j+=jumpStrength)
               {
                   visited[j]=true;
               }
           }
           
           
           for(int i=1;i<=leaves;i++)
           {
               if(!visited[i])
               {
                   count++;
               }
           }
           return count;
      }
      
      
      
      
      
    public int unvisitedLeaves_Brute_Force_Failed_for_5TEST_CASES(int n, int leaves, int frogs[]) {
        // Code here
        for (int i = 0; i < n; i++)
        {
          if (frogs[i] == 1) return 0;
        }
        
        
        boolean[] visited = new boolean[leaves+1];
        
        for(int i=0;i<n;i++)
        {
           int jumpStrength = frogs[i];
           for(int j=jumpStrength ; j<=leaves ; j+=jumpStrength)
           {
               visited[j]=true;
           }
        }
        
        int count=0;
        
        for (int i = 1; i <= leaves; i++) {
        if (!visited[i]) count++;
    }

        return count;
    }
}
