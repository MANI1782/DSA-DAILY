class Solution {
    public String smallestNumber(String pattern) {
        String ans[]=new String[1];
        boolean used[]=new boolean[10];
        track(pattern,new StringBuilder(),used,ans);
        return ans[0];
    }
    void track(String s,StringBuilder sb,boolean used[],String ans[]){
        if (ans[0] != null) return;
        if(s.length()+1==sb.length()){
            ans[0]=sb.toString();
            return;
        }
        for(int i=1;i<=9;i++){
            if(used[i]) continue;
            if (sb.length() > 0) {
            int prev=sb.charAt(sb.length()-1)-'0';
            char rule=s.charAt(sb.length()-1);
            if(rule=='I' && prev>=i) continue;
            if(rule=='D' && prev<=i) continue;
            }
            used[i]=true;
            sb.append((char)('0' + i));
            track(s,sb,used,ans);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }

}

