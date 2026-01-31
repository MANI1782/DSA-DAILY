class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int res=Integer.MAX_VALUE;

        while(j<nums.length){
            sum=sum+nums[j];
            while(sum>=target){
                int length=(j-i)+1;
                res=Math.min(res,length);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
            
        }else{
            return res;
        }
        
        
    }
}