//we need to find the product of left side elements and product of right side elements from the current index(self), and product of left and right will be the answer
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int [] answer = new int[nums.length];
        answer[0] = 1;
        int right = 1; 

        for(int i = 1;i<nums.length;i++){
            answer[i] = answer[i-1] * nums[i-1];
        }

        for(int i = nums.length-1;i>=0;i--){
            answer[i] = answer[i] * right;
            right*=nums[i];
        }

        return answer;
    }
}
