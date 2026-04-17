class Solution {
    public int minOperations(int[] nums) {
        int low=0;
        
        int count=0;

        
        for(int high=0;high<nums.length-2;high++){
            if(nums[high]==0){
                nums[high]^=1;
                nums[high+1]^=1;
                nums[high+2]^=1;
                count++;
            }
            
            
        }
        if(onecheck(nums)){
            return count;
        }else{
            return -1;
        }



        
    }
    boolean onecheck(int[] nums){
        for(int num:nums){
            if(num!=1){
                return false;
            }
        }
        return true;
    }
}