class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            count=count+rev(num,digit);
        }
        return count;
        
    }
    int rev(int num,int digit){
        int count=0;
        while(num>0){
            int last=num%10;
            if(last==digit){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}