class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> ans=new HashMap<>();
        int find=0;
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(ans.get(nums[i])==1){        

                find=nums[i];
                return find;
            }
        }
        return 0;
    }
}