class Solution {
    public int mirrorDistance(int n) {
       

        return Math.abs(n-rev(n));
        
    }
    int rev(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=(sum*10)+last;
            n=n/10;
        }
        return sum;
    }
}