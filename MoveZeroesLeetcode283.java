//Move Zeroes to the End
//Leetcode 283. Move Zeroes
// non zero elements ko array mai assign krte hue, last mai jitne non zeroes ho uski next index se last index tk 0 assign krdo elements mai.
class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
        int k = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            if(nums[i]!=0)
            {
            nums[k] = nums[i];
            k++;
            }
        }
        
        for(int i = k;i<n;i++)
        {
            nums[i] = 0;
            
        }
    }
}
