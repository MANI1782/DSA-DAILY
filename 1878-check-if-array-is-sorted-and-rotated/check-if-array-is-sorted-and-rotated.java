class Solution {
    public boolean check(int[] nums) {
        int j=0;
        int n = nums.length;
        
        for(int i=0;i<n-1;i++){
            if(nums[i]> nums[i+1] ){
                j++;
            }
            

        }
        if(nums[0]<nums[n-1]){
            j++;
        }
        return j<=1;
    }
}