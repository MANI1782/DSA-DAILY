class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        long best=0;
        long sum=0;
        for(int i=k;i<nums.length;i++){
            best=Math.max(best,nums[i-k]);
            sum=Math.max(sum,best+nums[i]);

        }
        return (int)sum;
    }
}

