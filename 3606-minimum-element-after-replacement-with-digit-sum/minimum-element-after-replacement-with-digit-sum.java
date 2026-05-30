class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int find=rev(num);
            
            res=Math.min(res,find);
        }
        return res;
        
    }
    int rev(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        return sum;
    }
}