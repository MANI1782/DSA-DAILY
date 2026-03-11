class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack=new Stack<>();
        //char 0==> d[2];
        //char 1==> repeated numbers 
        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);
            if(!stack.isEmpty() && left==stack.peek()[0]){
                stack.peek()[1]++;
            }else{
                stack.push(new int[]{left,1});
            }
            if(stack.peek()[1]==k){
                stack.pop();
            }

        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            int[] pair=stack.get(i);
            int j=0;
            while(j<pair[1]){
                sb.append((char)pair[0]);
                j++;
            }
        }
        return sb.toString();
       
        
    }
}