//Two pointers Algorithm
//Leetcode 26: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//ek pointer hold kare (i) , jab tak dusra pointer (j)traverse krke condition satisfy na krde, When condition is satisfied then increase the first pointer (i++).
//so, one pointer will be started out of loop (i=0) and increase based on condition (will be act as index for new array), right.
//Commented out code I did with taking three pointer, that is not needed.
 //NOTE: ONLY IN SORTED ARRAYS THIS WORKS, IN UNSORTED WE NEED HASHSET.
//-- With using same Array as output
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[k]!=nums[i])
            {
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}

//-------------------------------------------------------------------------------------------------------------
//-- With using extra arraylist as output in gfg
//--GfG: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
         ArrayList<Integer> result = new ArrayList<>();
         
         if (arr.length == 0)
         {
             return result;
         }
         
         result.add(arr[0]);
         
         
        
        for(int j = 1;j<arr.length;j++)
        {
            if(arr[j]!=arr[j-1])
            {
                result.add(arr[j]);
            }
        }
        return result;
        
    }
}
