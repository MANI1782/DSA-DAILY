class Solution {
    public int[] getNoZeroIntegers(int n) {

        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!zero(i) && !zero(j)) {
                return new int[] { i, j };
            }

        }
        return new int[0];
    }

    boolean zero(int n) {
        while(n>0){
            if(n%10==0){
                return true;
            }
            n=n/10;
        }
        return false;
    }
    
}