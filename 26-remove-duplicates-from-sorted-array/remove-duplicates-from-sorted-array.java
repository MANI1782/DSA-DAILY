class Solution {
    public int removeDuplicates(int[] nums) {
      
        
        int low=1;
        int index=0;
        while(low<nums.length){
            if(nums[low]==nums[low-1]){
                low++;
               
            }else{
               
                nums[index+1]=nums[low];
                index++;
                low++;
            }
        }
        return index+1;
        
    }
}