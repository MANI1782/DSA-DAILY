class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0;
        
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {

            int suffix = sum - nums[i] - prefix;
            if (suffix == prefix) {
                return i;
            }
            prefix = prefix + nums[i];

        }
        return -1;

    }
}