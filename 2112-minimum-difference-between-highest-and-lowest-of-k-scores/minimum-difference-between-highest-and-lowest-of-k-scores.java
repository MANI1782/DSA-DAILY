class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        
         if(k==1){
            return 0;
        }
        int res=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-k;i++){
            int minVal=nums[i];
            int nextVal=nums[i+k-1];
            int diff=nextVal-minVal;
            res=Math.min(res,diff);
        }
        return res;
        
    }
}