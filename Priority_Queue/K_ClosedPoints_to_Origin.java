public class K_ClosedPoints_to_Origin{
public int[][] kClosest(int[][] points, int k) {
    // Your code here
    /*
    Key Observations: 
    1. First of all i will make a priority queue
    2. In this i will insert the row index of points and the distance from origin
    3. After traversing through all the points i will take out k points indices from the
       queue and then i will store them in an pre declared array of size k 
       */
       
    
    int totalRows=points.length;   
    int totalCols=points[0].length;   
    
    int[][] result = new int[k][totalCols];
    
    //Priority queue Declaration 
    
    PriorityQueue<int[]> distanceWithorder =new  PriorityQueue<>((a, b) -> Integer.compare(a[0],b[0]));
    
    for(int i=0;i<totalRows;i++)
    {
        int distance = ( points[i][0] * points[i][0]) +  ( points[i][1] * points[i][1]);
        distanceWithorder.offer(new int[] {distance , i});
    }
    
    
    for(int i=k-1;i>=0;i--)
    {   
        int index= distanceWithorder.poll()[1];
        
        //Instead of these 2 lines 
        // result[i][0]= points[index][0];
        // result[i][1]= points[index][1];
        
        
        //Write this to copy entire row
        result[i]=points[index];
    }
    return result;
}
}