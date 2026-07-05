class Solution {
    public int maxDigitRange(int[] nums) {
        
        long sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int difference=diff(num);
            max=Math.max(max,difference); 
        }
        for(int i=0;i<nums.length;i++){
            if(diff(nums[i])==max){
                sum=sum+(long)nums[i];
            }
        }
        
        return (int)sum;

        
    }
    int diff(int nums){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(nums>0){
            int digit=nums%10;
            min=Math.min(min,digit);
            max=Math.max(max,digit);
            nums=nums/10;
        }
        return max-min;
    }
}