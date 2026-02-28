//Largest Element in the array
//if array is guaranteed non-empty, we can sure start our max with first element as max (one time comparison) (or either you handle that edge case when array's length is 0)
//but if array is empty, better we start max with Integer.MIN_VALUE (one extra comparison, but code won't fail if array is empty.)
class Solution {
    public static int largest(int[] arr) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            {
                if (arr[i]>max)
                {
                    max = arr[i];
                }
            }

            return max;
        // code here
        
    }
}
