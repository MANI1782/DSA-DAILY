class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=nums[0];
        int minSum=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(maxSum+nums[i],nums[i]);
            minSum=Math.min(minSum+nums[i],nums[i]);

            res=Math.max(res,Math.max(Math.abs(minSum),maxSum));
        }
        return Math.abs(res);
        
    }
}