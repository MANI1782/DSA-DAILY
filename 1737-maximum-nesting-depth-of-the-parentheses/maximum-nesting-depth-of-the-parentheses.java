class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int maxans=0;
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char v1='(';
            char v2=')';

            if(s1==v1){
                ans++;
                maxans=Math.max(ans,maxans);
            }else if(s1==v2){
                ans--;
            }
            
        }
        
        return maxans;
    }
}