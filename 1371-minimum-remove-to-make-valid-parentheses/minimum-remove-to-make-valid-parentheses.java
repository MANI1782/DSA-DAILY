class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> set=new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);

            } else if (ch == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) =='(') {
                    stack.pop();

                } else {
                    stack.push(i);
                }
            }
        }
        
        for (int i = 0; i < stack.size(); i++) {
            set.add(stack.get(i)) ;// if stack is a Stack<Integer> or ArrayList<Integer>
        }
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

       
        
        

    }
}