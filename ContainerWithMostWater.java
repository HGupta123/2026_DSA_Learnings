//Area depends upon the maximum width and minmum hight(jo height undono me kam hai).
//since our width is getting decreased, we need to increase the height in order to maximise the area.
// so we'll use here greedy optimal two pointer approach here to find the solution

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while(left<right)
        {
            int width = right - left;

            int h = Math.min(height[left],height[right]);
            
            int area = width * h;
        

        if(area>maxArea)
        {
            maxArea = area;
        }

        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }

        }
        return maxArea;

        
    }
}
