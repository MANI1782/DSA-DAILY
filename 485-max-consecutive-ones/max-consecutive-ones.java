class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int low=0;
        int count=0 ;
        int res=0;
        for(int high=0;high<nums.length;high++){
            if(nums[high]==1){
                count++;
                res=Math.max(res,count);
                
            }else{
                count=0;
            }

        }
        return res;
        
    }
}