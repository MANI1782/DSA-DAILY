class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. MUST SORT the intervals by start time first
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. Use List<int[]> to make adding intervals easier
        List<int[]> ans = new ArrayList<>();
        
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            // If intervals overlap (end of 1st >= start of 2nd)
            if (end1 >= start2) {
                // Merge: keep the same start, but pick the further end
                end1 = Math.max(end1, end2);
            } else {
                // No overlap: add the previous merged interval to results
                ans.add(new int[]{start1, end1});
                
                // Reset start and end to the current interval
                start1 = start2;
                end1 = end2;
            }
        }
        
        // 3. Very Important: Add the LAST interval remaining after the loop
        ans.add(new int[]{start1, end1});

        // 4. Convert the List back to a 2D Array
        int[][] answer = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}