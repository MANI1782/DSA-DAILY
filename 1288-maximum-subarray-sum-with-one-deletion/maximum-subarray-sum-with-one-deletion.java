class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];

        // nodelete: Max sum ending here with 0 deletions
        int nodelete = arr[0];
        // onedelete: Max sum ending here with 1 deletion
        int onedelete = arr[0]; 
        int res = arr[0];

        for (int i = 1; i < n; i++) {
            // Option 1: To have 1 deletion at index 'i', we either:
            // a) Use a previous deletion and add current element: onedelete + arr[i]
            // b) Delete the current element: previous nodelete
            onedelete = Math.max(onedelete + arr[i], nodelete);

            // Option 2: Standard Kadane's for 0 deletions
            nodelete = Math.max(nodelete + arr[i], arr[i]);

            // Update global result
            res = Math.max(res, Math.max(nodelete, onedelete));
        }

        return res;
    }
}