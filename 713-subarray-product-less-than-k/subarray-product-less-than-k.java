class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int product=1;
        int count=0;
        int low=0;
        if(nums.length==1) return 0;
        for(int high=0;high<nums.length;high++){
            product=product*nums[high];

            while(product>=k){
                product=product/nums[low];
                low++;
            }
            if(product<k){
                count=count+(high-low+1);
            }


        }
        return count;
    }
}