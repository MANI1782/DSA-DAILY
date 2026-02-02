class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int low=0;
    int sum=0;
    int res=Integer.MAX_VALUE;
    for(int high=0;high<nums.length;high++){
        sum=sum+nums[high];
        while(sum>=target){
            int length=high-low+1;
           
            sum=sum-nums[low];
            low++;
             res=Math.min(res,length);
        }
    }
    
    return res==Integer.MAX_VALUE ? 0: res;
    
    }
}