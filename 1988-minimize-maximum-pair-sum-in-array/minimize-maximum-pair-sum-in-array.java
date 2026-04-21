class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=Integer.MIN_VALUE;

        int i=0;
        int j=nums.length-1;
        while(i<j){
            res=Math.max(res,nums[j]+nums[i]);
            i++;
            j--;
        }
        return res;
        
    }
}