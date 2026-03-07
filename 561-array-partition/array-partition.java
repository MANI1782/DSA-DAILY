class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int res=0;
        
        for(int i=0;i<nums.length;i=i+2){
            res=Math.min(nums[i],nums[i+1]);
            count=count+res; 
        }
        return count;
        
    }
}