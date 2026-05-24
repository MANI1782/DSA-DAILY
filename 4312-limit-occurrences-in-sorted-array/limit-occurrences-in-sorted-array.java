class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] ans=new int[nums.length];
        int idx=0;
        int count=0;
        ans[0]=nums[0];
        idx++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=0;
            }
            if(count<k){
                ans[idx]=nums[i];
                idx++;
            }
            
        

           
        }
        return Arrays.copyOf(ans,idx);
    }
    
}