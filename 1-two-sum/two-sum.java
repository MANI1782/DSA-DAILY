class Solution {
      
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ans=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(ans.containsKey(compliment) && i!=ans.get(compliment)){
                return new int[]{i,ans.get(compliment)};
            }
        }
        return new int[]{};

    

    }
}