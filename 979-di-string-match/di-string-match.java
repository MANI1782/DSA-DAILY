class Solution {
    public int[] diStringMatch(String s) {
        int[] ans=new int[s.length()+1];
        int left=0;
        int right=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                ans[i]=left;
                left++;
            }else {
                ans[i]=right;
                right--;
            }
        }
        ans[s.length()]=left;

        return ans;
    }
}