class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                ans.push(ch);
            }else{
                 if (ans.isEmpty()) return false;
                int top=ans.pop();
                if(ch==')' && top!='(') return false;
                if(ch=='}' && top!='{') return false;
                if(ch==']' && top!='[') return false;
            }
        }
        return ans.isEmpty();
       
    }
}