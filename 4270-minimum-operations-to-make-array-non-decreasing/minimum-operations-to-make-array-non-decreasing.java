class Solution {
    public long minOperations(int[] nums) {
        long count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                count=count+nums[i-1]-nums[i];

            }
        }
        return count;
        
    }
}