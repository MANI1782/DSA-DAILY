class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
 
        int low=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int high=0;high<nums.length;high++){
            if(freq.containsKey(nums[high])){
                int diff=high-freq.get(nums[high]);
                if(diff<=k){
                return true;
            }

            }
            freq.put(nums[low],high);
            low++;
           
        
         }
    return false;
    }
}