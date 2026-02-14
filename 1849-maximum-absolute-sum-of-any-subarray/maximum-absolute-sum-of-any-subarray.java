class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestans=nums[0];
        int absans=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            bestans=Math.max(bestans+nums[i],nums[i]);
            absans=Math.min(absans+nums[i],nums[i]);
            res=Math.max(res,Math.max(Math.abs(absans),bestans));

        }
        return Math.abs(res);


    }      
}