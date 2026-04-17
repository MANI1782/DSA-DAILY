class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        parentesis(n,0,0,ans,"");
        return ans;
        
    }
    void parentesis(int n,int open,int close,List<String> ans,String temp){
        if(open==n && close==n){
            ans.add(temp);
        }

        if(open<n){
            parentesis(n,open+1,close,ans,temp+"(");
        }
        if(close<open){
            parentesis(n,open,close+1,ans,temp+")");
        }
    }
}