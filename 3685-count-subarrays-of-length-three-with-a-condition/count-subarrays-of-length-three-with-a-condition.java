class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        int low=0;
        for(int high=0;high<nums.length;high++){

            while(high-low+1>3){
                low++;
            }                                   //2 8 2 1
            if(high-low+1==3){
                int sum=nums[low]+nums[high]; // 4
                
                if(sum*2==nums[high-1]){
                    count++;
                }
            }
        }
        return count;
        
    }
}