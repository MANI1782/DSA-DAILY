class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] res = new int[n1 + n2][2]; // maximal possible size
        int i = 0, j = 0, idx = 0;

        while (i < n1 && j < n2) {
            if (nums1[i][0] == nums2[j][0]) {
                res[idx][0] = nums1[i][0];
                res[idx][1] = nums1[i][1] + nums2[j][1];
                idx++; i++; j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                res[idx][0] = nums1[i][0];
                res[idx][1] = nums1[i][1];
                idx++; i++;
            } else {
                res[idx][0] = nums2[j][0];
                res[idx][1] = nums2[j][1];
                idx++; j++;
            }
        }
        while (i < n1) {
            res[idx][0] = nums1[i][0];
            res[idx][1] = nums1[i][1];
            idx++; i++;
        }
        while (j < n2) {
            res[idx][0] = nums2[j][0];
            res[idx][1] = nums2[j][1];
            idx++; j++;
        }

        // If not all allocated rows are used, trim the array to correct size
        if (idx < n1 + n2) {
            return Arrays.copyOf(res, idx);
        } else {
            return res;
        }
    }
}