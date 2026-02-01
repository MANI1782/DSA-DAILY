class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i=0;
        Set<Integer> freq=new HashSet<>();
        for(int high=0;high<nums.length;high++){
            if(freq.contains(nums[high])){
              return true;
            };
            freq.add(nums[high]);
            }
        
        return false;
    }
}