//https://leetcode.com/problems/maximum-subarray/
//Kadane's Algorithm
class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i= 0;i<nums.length;i++)
        {
        if(currSum+nums[i]>nums[i])
        {
            currSum = currSum+nums[i];
        }
        else
        {
            currSum = nums[i];
        }
        if(currSum>maxSum)
        {
            maxSum = currSum;
        }
        
        }

        return maxSum;
        
        
    }
}
