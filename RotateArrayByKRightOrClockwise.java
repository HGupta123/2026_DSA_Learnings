//Leetcode 189: Rotate Array: https://leetcode.com/problems/rotate-array/description/
//Observation:
//first observation: let's say n no. of elements are there.
//then after n repeated rotation of array it will regain itself. Then ignore those cycles
//use k = k % n; (eg: 6 elements, 13 times rotate the array then after 6*2 =12 times it will regain itself.) - Otherwise TLE.
// Second observation is after reversing the whole array, on kth iteration observe last k+1 to n-1 elements should be reversed to get desired array and from 0 to k-1 elements should also be reversed.
 
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
 
        reverseArray(nums, 0, n-1);
        reverseArray(nums, k, n-1);
        reverseArray(nums, 0, k-1);
 
        }
 
    public void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
