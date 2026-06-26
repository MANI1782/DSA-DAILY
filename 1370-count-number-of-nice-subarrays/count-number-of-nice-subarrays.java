class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
        

        
    }
    int sub(int[] nums,int k){
        int low=0;
        int count=0;
        int evencount=0;
        int oddcount=0;

        for(int high=0;high<nums.length;high++){
            if(nums[high]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            while(oddcount>k){
                if(nums[low]%2!=0){
                    oddcount--;
                }
                low++;
            }
            if(oddcount<=k){
                count+=high-low+1;
            }
            

        }
        return count;
    }
}