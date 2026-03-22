//Way 1:
//Clockwise rotation: means forward traversing won't work as you will be loosing previous element in iterations. So TRAVERSE BACK in the array.
 
//Way 2:
//Observation: reversing whole array and then reverse array from element 1 to last.
 
 
class Solution {
    public void rotate(int[] arr) {
        // int n = arr.length;
        // int temp  = arr[n-1];
        // for(int i=n-1; i>0; i--){
        //     arr[i] = arr[i-1];
        // }
        // arr[0] = temp;
        reverseArray(arr, 0);
        reverseArray(arr, 1);
    }
    public static void reverseArray(int[] arr, int start){
            int left = start;
            int n = arr.length;
            int right = n-1;
            while(left< right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
}
