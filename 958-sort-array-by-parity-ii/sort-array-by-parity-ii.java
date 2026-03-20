class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int idx=0;
        int jdx=1;
        while(i<=j){
            if(nums[i]%2==0){
                ans[idx]=nums[i];
                i++;
                idx=idx+2;
            }else if(nums[i]%2!=0){
                ans[jdx]=nums[i];
                i++;
                jdx=jdx+2;
            }
        }
        return ans;
        
    }
}