class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
   
        int minSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            minSum=minSum+nums[i];
            maxSum=maxSum+nums[nums.length-1-i];
        }
        return Math.abs(maxSum-minSum);
  
    }
}