class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer,Integer> freq=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);

            if(freq.get(nums[i])>1){
                return nums[i];
            }
            ans=nums[i];
        }
        return ans;
        
    }
}