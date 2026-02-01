class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. A HashSet to store every number we've encountered
        Set<Integer> seen = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // 2. The Value: "Is this specific number already in my bag?"
            if (seen.contains(nums[i])) {
                return true; // Found a match! Alarm goes off, function ends.
            }
            
            // 3. If it's a new number, put it in the bag
            seen.add(nums[i]);
        }
        
        // 4. If we finish the loop, it means every number was unique
        return false;
    }
}