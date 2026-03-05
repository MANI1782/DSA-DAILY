class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=temperatures.length-1;i>=0;i--){

        
        while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
            stack.pop();
        }if(stack.isEmpty()){
            ans.add(0);
        }else{
            ans.add(stack.peek()-i);
        }
        stack.push(i);

        }
        Collections.reverse(ans);
        int[] res=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            res[k]=ans.get(k);
        }
        return res;
    }
}