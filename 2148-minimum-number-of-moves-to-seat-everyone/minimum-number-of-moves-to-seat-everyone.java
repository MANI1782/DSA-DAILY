class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // 1. Sort both to align smallest seats with smallest students
        Arrays.sort(seats);
        Arrays.sort(students);
        
        int i = 0;
        int j = 0;
        int totalSum = 0; // This will store the total distance

        // 2. Loop through and accumulate the distances
        while (i < seats.length && j < students.length) {
            // Add the absolute difference of the current pair to the total
            totalSum += Math.abs(seats[i++] - students[j++]);
        }

        // 3. Return the final total accumulation
        return totalSum;
    }
}