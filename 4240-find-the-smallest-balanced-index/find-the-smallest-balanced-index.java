class Solution {
    public int smallestBalancedIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        long[] prefix=new long[nums.length];
        double[] suffix=new double[nums.length];
        int index=-1;
        prefix[0]=0;
        suffix[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]+nums[i-1];
            
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
            if (suffix[i] > 2e14) { 
                suffix[i] = (long)2e15; 
            }
        }
        for(int i=0;i<nums.length;i++){
            if(suffix[i]==prefix[i]){
               return i;
            }
        }
        return -1;
        
    }
}