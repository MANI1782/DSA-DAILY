class Solution {
    public String minWindow(String s, String t) {
    if (s.length() == 0 || t.length() == 0) return "";

    // Frequency map for characters in t
    Map<Character, Integer> dictT = new HashMap<>();
    for (char c : t.toCharArray()) {
        dictT.put(c, dictT.getOrDefault(c, 0) + 1);
    }

    int required = dictT.size();

    // Left and Right pointer
    int left = 0, right = 0;

    // Formed counts how many chars have met the required frequency in current window
    int formed = 0;

    Map<Character, Integer> windowCounts = new HashMap<>();

    // Result tuple (window length, left, right)
    int[] ans = {-1, 0, 0};

    while (right < s.length()) {
        char c = s.charAt(right);
        windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

        // Check if current char meets frequency needed
        if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
            formed++;
        }

        // Try to contract the window till it ceases to be 'desirable'
        while (left <= right && formed == required) {
            c = s.charAt(left);

            // Update result if smaller window found
            if (ans[0] == -1 || right - left + 1 < ans[0]) {
                ans[0] = right - left + 1;
                ans[1] = left;
                ans[2] = right;
            }

            // Remove from windowCounts
            windowCounts.put(c, windowCounts.get(c) - 1);
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                formed--;
            }

            left++;
        }

        right++;
    }

    return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
}

}