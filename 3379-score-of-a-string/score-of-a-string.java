class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=1;i<s.length();i++){
            char left=s.charAt(i);
            char right=s.charAt(i-1);
            ans=ans+Math.abs(left-right);
        }
        return ans;
    }
}