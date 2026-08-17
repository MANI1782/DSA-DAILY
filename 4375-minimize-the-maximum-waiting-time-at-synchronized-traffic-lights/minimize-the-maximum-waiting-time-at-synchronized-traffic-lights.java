class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = Integer.MIN_VALUE;
        int totalMax = Integer.MIN_VALUE;
        for (int num : lights) {
            max = Math.max(max, num);
        }
        for (int i = 0; i < arrivalTime.length; i++) {
            int ans = arrivalTime[i] % period;
            if (ans < max)
                continue;
            else if (ans >= max) {
                int sum = period - ans;
                totalMax = Math.max(totalMax, sum);
            }
        }
        if (totalMax == Integer.MIN_VALUE)
            return 0;
        return totalMax;
    }
}