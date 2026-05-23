class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder(); // a b c d e e  k=2
        int low=0;
        int count=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            
            int ans=ch-'a';
            count=count+ans;

            while(high-low+1>k){
                low=low+k;
                
            }
            if(high-low+1==k){
                char ans1=(char)('a'+count%26);
                
                sb.append(ans1);
                count=0;
            }
        }
        return sb.toString();
        
    }
}