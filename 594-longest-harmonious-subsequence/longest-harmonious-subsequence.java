class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int res=0;
        for(int high=0;high<nums.length;high++){
            while(nums[high]-nums[low]>1){
                low++;
            }if(nums[high]-nums[low]==1){
                res=Math.max(res,high-low+1);
            }
           
        }
        
        return res;
        
    }
}