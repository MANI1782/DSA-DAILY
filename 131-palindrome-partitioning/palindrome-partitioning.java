class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        track(s,0,curr,res);
        return res;
    
    }

    public void track(String s,int idx,List<String> curr,List<List<String>> res){
        if(s.length()==idx){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++){
            String temp=s.substring(idx,i+1);
            if(isPalindrome(temp)){
                curr.add(temp);
                track(s,i+1,curr,res);
                curr.remove(curr.size()-1);

            }
        }
    }

    public boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}