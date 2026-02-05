class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        
        int left = 0;      // Smallest available
        int right = n;     // Largest available
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = left;
                left++;
            } else {
                ans[i] = right;
                right--;
            }
        }
        
        // Final Step: left and right will meet here. 
        // Put the last remaining number in the last slot.
        ans[n] = left; 
        
        return ans;
    }
}