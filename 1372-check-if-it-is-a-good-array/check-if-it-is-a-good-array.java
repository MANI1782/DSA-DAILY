class Solution {
    public boolean isGoodArray(int[] nums) {
        int count=nums[0];
        for(int i=0;i<nums.length;i++){
            count=gcd(count,nums[i]);
            
        }
        return count==1;
        
        
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }   
        return gcd(b,a%b);
    }
}