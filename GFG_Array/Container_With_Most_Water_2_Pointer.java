public class Container_With_Most_Water_2_Pointer {
    public int maxWater(int arr[]) {
        // Code Here
        int n=arr.length;
        if(n<1)
        {
            return 0;
        }
        int i=0;
        int j=n-1;
        int area=0;
        while(i<j)
        {
            int currentArea= Math.min(arr[i],arr[j])*(j-i);
            if(arr[i]<arr[j])
            {
                i++;    //This means that we have calculated 
                        // the water stored for the container of height arr[left],
                        // so increment left by 1.
            }
            else
             {             //This means that we have calculated
            //               the water stored for the container of height arr[right],
            //               so decrement right by 1.
                j--;
            }
            
            // We are moving the pointer pointing to the shorter line to potentially
            // find a taller line and increase the container's height. 
            // Moving the pointer to the taller line would only reduce the width, 
            // but the height
            // cannot increase because of the shorter line, 
            // thus decreasing the amount of water.
            area=Math.max(area,currentArea);
        }
        return area;
    }
}
