class Solution {
    public int differenceOfSum(int[] nums) {
        int arrsum=0;
        int digitsum=0;

        for(int num:nums){
            arrsum+=num;
        }
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num!=0){
                int last=num%10;
                digitsum+=last;
                num=num/10;
            }
         

        }
        return Math.abs(arrsum-digitsum);
    }
}