class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums); // Line them up: 0, 1, 2, 3...
        
        // Check every spot
        for (int i = 0; i < nums.length; i++) {
            // If the number doesn't match the index, the index is missing!
            if (nums[i] != i) {
                return i;
            }
        }
        
        // If we checked everything and all matched, the missing number is the last one (n)
        return nums.length;
    }
}