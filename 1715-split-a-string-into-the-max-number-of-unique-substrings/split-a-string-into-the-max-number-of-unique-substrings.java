class Solution {
    int maxcount=0;
    public int maxUniqueSplit(String s) {
        Set<String> set=new HashSet<>();
        int count=0;
        track(0,s,set,0);
        return maxcount;

        
    }
    void track(int idx,String s,Set<String> set,int count){
        
        if(idx==s.length()){
            maxcount=Math.max(maxcount,count);
            return ;
        }
        for(int i=idx;i<s.length();i++){
            String str=s.substring(idx,i+1);
            if(!set.contains(str)){
                set.add(str);
                track(i+1,s,set,count+1);
                set.remove(str);
            }

        }
    }
}