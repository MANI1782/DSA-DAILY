class Solution {
    public int longestSubarray(int[] nums) {
      int low = 0;
      int countone = 0;
      int countzero = 0;
      int res = 0;
      for(int high=0; high<nums.length; high++){
        if(nums[high]==1){
            countone++;
        }
        else{
            countzero++;
        }
        while(countzero>1){
            if(nums[low]==0){
                countzero--;
            }
            low++;
        }
        if(countzero<=1){
            res = Math.max(res,high-low+1);
        }
      }
    return res-1;
    }
}