class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // 1. Create a sorted copy of the array
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        // 2. Map each unique value to its rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            // If the map doesn't contain the number, assign the current rank
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        // 3. Transform the original array
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        
        return result;
    }
}