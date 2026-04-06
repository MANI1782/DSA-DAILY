class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

for(int j=0;j<k;j++){
       int min=0;
       for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
       }
       nums[min]=nums[min]*multiplier;
}
return nums;
        
    }
}