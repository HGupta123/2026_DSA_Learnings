//Jab bhi naya maximum milta hai, uss se pehle wala maximum automatically second largest ban jata hai.

//If current element < max but current element > second largest -- then update second largest
 
class Solution {
    public int getSecondLargest(int[] nums) {
        // code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0;i<n;i++)
        {
            if(nums[i]>largest)
            {
                secondLargest = largest;
                largest = nums[i];
            }

            else if(secondLargest < nums[i] && nums[i]!=largest)
            {
                secondLargest = nums[i];
            }
            
            

            
        }
        if(secondLargest==Integer.MIN_VALUE)
            {
                return -1;
            }
        return secondLargest;
    }
}
