class Solution {
    public int repeatedNTimes(int[] nums) {

        Set<Integer> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return nums[i];
            }
            ans.add(nums[i]);
        }
        return -1;
    }
}