class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[2*nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            ans[idx]=nums[i];
            idx++;
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[idx]=nums[i];
            idx++;
        }
        return ans;

        
    }
}