class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        int i=1; int count=1;
        while(i<nums.length){
           
            if(nums[i]==nums[i-1]){
                
                count++;
            }else {
                count=1;
               
                }
            if (count <= 2) {
                index++;
                nums[index] = nums[i];
            }
            i++;
             
        } 
          return index+1;  
         
    }

}