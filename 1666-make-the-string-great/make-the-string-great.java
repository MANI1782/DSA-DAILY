class Solution {
    public String makeGood(String s) {

        Stack<Character> ans=new Stack<>();
        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);
            ;
            if(!ans.isEmpty() && Math.abs(ans.peek()-left)==32){
                ans.pop();
            }else{
                ans.push(left);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<ans.size();k++){
            sb.append(ans.get(k));
        }
        return sb.toString();
    }
}