class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int idex=0;
        int jdx=nums.length-1;
        while(i<=j){
            if(nums[i]%2==0){
                ans[idex++]=nums[i++];
            
            }else if(nums[i]%2!=0){
                ans[jdx--]=nums[i++];
                
                
                

            }
            
        }
        return ans;

        
    }
}