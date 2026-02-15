class Solution {
    public int subarraySum(int[] nums, int k) {
     Map<Integer,Integer> ans=new HashMap<>();
     ans.put(0,1);
     int prefix=0;
     int count=0;

     for(int i=0;i<nums.length;i++){
        prefix=prefix+nums[i];

        if(ans.containsKey(prefix-k)){
            count=count+ans.get(prefix-k);
        }
        
            ans.put(prefix,ans.getOrDefault(prefix,0)+1);
        
     }
     return count;
        
    }
}