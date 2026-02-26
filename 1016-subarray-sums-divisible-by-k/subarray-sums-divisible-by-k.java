class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix=0;
        int count=0;
        Map<Integer,Integer> ans= new HashMap<>();
        ans.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            int rem=prefix%k;
            if(rem<0){
                rem=rem+k;
            }
            if(ans.containsKey(rem)){
                count+=ans.get(rem);
            }
                ans.put(rem,ans.getOrDefault(rem,0)+1);
            
        }
        return count;

  } 
    
}