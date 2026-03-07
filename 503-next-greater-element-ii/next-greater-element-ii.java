class Solution {
    public int[] nextGreaterElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=nums.length*2-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <=nums[i%n]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(stack.peek());
            }
            stack.push(nums[i%n]);
        }
        Collections.reverse(ans);
      int[] res=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        res[i]=ans.get(i);
      }
      return res;
    }
    
}