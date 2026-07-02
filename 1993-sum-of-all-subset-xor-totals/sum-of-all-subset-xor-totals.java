class Solution {
    public int subsetXORSum(int[] nums) {
        
        return track(nums,0,0,0);
    }
    int track(int nums[],int idx,int sum,int xor){
        if(nums.length==idx){
            return xor;
        }
        int newxor=xor^nums[idx];
        int take=track(nums,idx+1,sum+newxor,newxor);
        int skip=track(nums,idx+1,sum,xor);
    return skip+take;
    
    }

}