class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }

        //19;
        int count=0;
        while(sum%k!=0){
            count++;
            sum-=1;
        }
        return count;
        
    }
}