class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
 
        int low=0;
        Set<Integer> freq=new HashSet<>();
        for(int high=0;high<nums.length;high++){

            if(freq.contains(nums[high])){
                return true;
            }
            freq.add(nums[high]);
            if(freq.size()>k){
                freq.remove(nums[low]);
                low++;
            }
        }
        return false;
        
    }
}