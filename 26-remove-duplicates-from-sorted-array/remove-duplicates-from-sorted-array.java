class Solution {
    public int removeDuplicates(int[] nums) {
      int i = 1;
      int index = 0;
      while(i<nums.length){
        if(nums[i]==nums[i-1]){
            i++;
        }
        else{
            nums[index+1]=nums[i];
            index++;
            i++;
        }
      }
      return index+1;  
    }
}