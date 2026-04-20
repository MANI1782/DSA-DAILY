class Solution {
    public int divisorSubstrings(int num, int k) {
        String ans = String.valueOf(num); //"240"
        int count = 0;
        int low = 0;

        for (int high = 0; high < ans.length(); high++) {
            

            while (high - low + 1 > k) {
                low++;
            }

            if (high - low + 1 == k) {
               // find index of ch in ans
               
                 String s = ans.substring(low, high+1);
                 int t=Integer.parseInt(s);
                

                if (t!=0 && num % t == 0) {
                    count++;
                }
            }
        }
        return count;

    }
}