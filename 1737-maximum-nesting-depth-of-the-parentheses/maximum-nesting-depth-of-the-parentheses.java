class Solution {
    public int maxDepth(String s) {
        int count=0;
    int res=0;
        Stack<Character> ans=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                
                count--;
            }else if (ch=='('){
                
                count++;
            }
            else{
                ans.push(ch);
            }

            res=Math.max(res,count);
        }
        return res;
  
    }
}