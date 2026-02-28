// if we found any single occurence of next ele > prev ele, then array is not sorted.

class Solution {
    public boolean isSorted(int[] nums) {
        // code here
        
        int arraySize = nums.length;
        for(int i = 0;i<arraySize-1;i++)
        {
        if(nums[i]>nums[i+1])
        {
            return false;
        }
        }
        return true;

        //your code goes here
    }
        
    }
