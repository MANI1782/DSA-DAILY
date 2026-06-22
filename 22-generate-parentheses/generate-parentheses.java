class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        parentesis(n,0,0,list,"");
        return list;


    }
      
      void parentesis(int n,int start,int end,List<String> ans,String temp){
            if(start==n && end==n){
                ans.add(temp);
            }
            if(start<n){
                parentesis(n,start+1,end,ans,temp+'(');
            }
            if(end<start){
                parentesis(n,start,end+1,ans,temp+')');
            }
      }
}