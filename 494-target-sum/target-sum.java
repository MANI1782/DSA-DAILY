class Solution {
    int maxcount=0;
    public int findTargetSumWays(int[] nums, int target) {
        track(nums,0,0,0,target);
        return maxcount;
    }
    void track(int nums[],int idx,int sum,int count,int target){
        if(nums.length==idx){
            if(sum==target){
                maxcount++;
              
            }
             return ;
           
        }
        
            sum=sum+nums[idx];
            track(nums,idx+1,sum,count,target);
            sum=sum-nums[idx];
        
            
            sum=sum-nums[idx];
            track(nums,idx+1,sum,count,target);
            sum=sum+nums[idx];

        
       
    }
}