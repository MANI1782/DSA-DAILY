class Solution {
    public int minimumSwaps(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            while(j >= 0 && nums[j]==0){
                j--;
            }
            while(i<nums.length-1 && nums[i]!=0 ){
                i++;
            }
            if(i<j){
                i++;
                j--;
                count++;
            }
        }
        return count;


        
    }
}