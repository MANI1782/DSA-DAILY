class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int count = 0;
        int countzero = 0;
        int countone = 0;
        for(int high=0; high<nums.length; high++){
            if(nums[high]==1){
                countone++;
            }
            else{
                countzero++;
            }
            while(countzero>k){
                if(nums[low]==0){
                    countzero--;
                }
                low++;
            }
            if(countzero<=k){
                count = Math.max(count,high-low+1);
            }
        }

    return count;    
    }
}