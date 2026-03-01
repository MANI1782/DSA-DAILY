class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);
            if(!ans.isEmpty() && ans.peek()==left){
                ans.pop();
            }else{
                ans.push(left);
            }
        }

        String answer="";
        for(int k=0;k<ans.size();k++){
            answer=answer+ans.get(k);
        }    
return answer;
    }
}