class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int low = 0;
        int count = 0;
        int countzero = 0;
        int res = 0;
        for(int high=0; high<nums.length; high++){
            if(nums[high]==1){
                count+=1;
            }
            else{
                count=0;
            }
            res = Math.max(count,res);   
        }
    return res; 
    }
}