//we don't need to convert String into character array.
//directly use charAt method of String
class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int n = s1.length()-1;

        int first = 0;
        int last = n;

        while(first<last)
        {
            if (s1.charAt(first)!=s1.charAt(last))
            {
               return false;
            }
            else
            {
                first++;
                last--;
            }
        }
        return true;
        
        
    }
}
