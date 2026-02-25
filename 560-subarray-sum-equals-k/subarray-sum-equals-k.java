class Solution {
   
    public int subarraySum(int[] nums, int k) {
        int prefix=0;
        int count=0;
        Map<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int sum=prefix-k;
            if(ans.containsKey(sum)){
                count=count+ans.get(sum);
            }
            ans.put(prefix,ans.getOrDefault(prefix,0)+1);
        }
        return count;
  
        
    }
}