class Solution {
    public int[] countOppositeParity(int[] nums) {
        int evencount=0;
        int oddcount=0;
        int ans[]=new int[nums.length];

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0){
                ans[i]=oddcount;
                evencount++;
            }else{
                ans[i]=evencount;
                oddcount++;
            }
        }
        return ans;
        
    }
}