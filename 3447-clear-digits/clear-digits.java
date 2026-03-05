class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' ||ch=='7'|| ch=='8' || ch=='9' || ch=='0'){
                stack.pop();
            }else{
            stack.push(ch);
            }
        }
       while(!stack.isEmpty()){
        sb.append(stack.pop());
       }
       sb.reverse();
      
        return sb.toString();
    }
}