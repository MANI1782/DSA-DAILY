class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        int onecount=0;
      
        int low=0;
        
        for(int high=0;high<s.length();high++){
            if(s.charAt(high)=='1'){
                onecount++;
            }
            while(onecount>k ){
                char ch=s.charAt(low);
                if(ch=='1'){
                    onecount--;
                }
                low++;
            }
            while (onecount == k && s.charAt(low) == '0') {
                low++;
            }
            if(onecount==k ){
                String curr=s.substring(low,high+1);
                if(ans.isEmpty() || curr.length()<ans.length() || curr.length()==ans.length() && curr.compareTo(ans) < 0){
                    ans=curr;
                }
            }

        }
        
     
       
        return ans;
        
    }
}