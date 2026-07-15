class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int num:nums){
            small=Math.min(num,small);
            large=Math.max(num,large);
        }
        return gcd(small,large);
        
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}