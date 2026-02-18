class Solution {
    public int[] shuffle(int[] nums, int n) {
        // 1. Each part only needs to be size 'n'
        int[] ans1 = new int[n];
        int[] ans2 = new int[n];
        int[] add = new int[2 * n]; // The final result must be the same size as nums
        
        // 2. Fill the first half
        for (int i = 0; i < n; i++) {
            ans1[i] = nums[i];
        }
        
        // 3. Fill the second half
        // Logic: Grab from 'n+i' in nums, but put into 'i' in ans2
        for (int i = 0; i < n; i++) {
            ans2[i] = nums[i + n];
        }
        
     int i=0;
     int k=0;
     while(i<n){
        add[k]=ans1[i];
        k++;
        add[k]=ans2[i];
        i++;
        k++;
     }
        
        return add;
    }
}