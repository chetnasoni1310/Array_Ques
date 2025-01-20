public class _11_Container_With_Most_Water_2_pointer_L {
     // 11. Container With Most Water
    // https://leetcode.com/problems/container-with-most-water/
    public int maxArea(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        int area=0;
        while(i<j)
        {
            int currarea=Math.min(arr[i],arr[j]) *(j-i);
            area=Math.max(area,currarea);
            if(arr[i]<=arr[j])
            {
                  i++;
            }
            else
            j--;
            
        }
        return area;
    }
}

