class Solution {
    public int maxSubArray(int[] nums) {
        int bestanswer=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=bestanswer+nums[i];
            int v2=nums[i];
            bestanswer=Math.max(v1,v2);
            ans=Math.max(ans,bestanswer);
        }
        return ans;
        
    }
}