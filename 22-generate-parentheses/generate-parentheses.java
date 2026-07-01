class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        parentesis(n,0,0,list,new StringBuilder());
        return list;


    }
      
      void parentesis(int n,int start,int end,List<String> ans,StringBuilder sb){
            if(start==n && end==n){
                ans.add(sb.toString());
            }
            if(start<n){
                sb.append('(');
                parentesis(n,start+1,end,ans,sb);
                 sb.deleteCharAt(sb.length()-1);
            }
            if(end<start){
                sb.append(')');
                parentesis(n,start,end+1,ans,sb);
                sb.deleteCharAt(sb.length()-1);
            }
      }
}