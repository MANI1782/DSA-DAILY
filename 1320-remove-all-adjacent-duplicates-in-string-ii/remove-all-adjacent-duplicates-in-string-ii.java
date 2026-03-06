class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek()==left){
                count++;
                
            }else{    
                count=1;
            }
            stack.push(left);
            if(count==k){
                while(count>0){
                    stack.pop();
                    count--;
                }
                
                if(!stack.isEmpty()){
                    char top=stack.peek();
                    int j=stack.size()-1;
                    while(j>=0 && stack.get(j)==top){
                        count++;
                        j--;
                    }
                }
            }

        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
        }
        return sb.toString();
        
    }
}