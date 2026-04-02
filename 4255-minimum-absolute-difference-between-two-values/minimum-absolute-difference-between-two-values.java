class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        int oneidx=-1;
        int twoidx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                oneidx=i;
            }else if(nums[i]==0){
                continue;
            }else if(nums[i]==2){
                twoidx=i;
            }
            if(oneidx!=-1 && twoidx!=-1){
                min=Math.min(min,Math.abs(oneidx-twoidx));
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
        
        
    }
}