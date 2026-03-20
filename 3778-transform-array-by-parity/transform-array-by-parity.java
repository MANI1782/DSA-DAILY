class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;

        int idx=0;
        int jdx=nums.length-1;

        while(i<=j){
            if(nums[i]%2==0){
                ans[idx]=0;
                i++;
                idx++;
            }else if(nums[i]%2!=0){
                ans[jdx]=1;
                i++;
                jdx--;
            }
        }
        return ans;
        
    }
}