class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int j=nums.length-1;
        int i=nums.length-2;
       
        int ans=(nums[i]-1)*(nums[j]-1);
        return ans;

        
        
    }
}