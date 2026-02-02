class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // We use a Set to act as our "sliding window" of size k
        Set<Integer> window = new HashSet<>();
        int low = 0;

        for (int high = 0; high < nums.length; high++) {
            // 1. If the number is already in our window, we found a nearby duplicate!
            if (window.contains(nums[high])) {
                return true;
            }

            // 2. Add the current number to the window
            window.add(nums[high]);

            // 3. This is where your 'low' logic comes in:
            // If the window size exceeds k, remove the oldest element
            if (window.size() > k) {
                window.remove(nums[low]);
                low++;
            }
        }

        return false;
    }
}