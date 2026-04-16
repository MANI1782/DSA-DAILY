class Solution {
    public double findMaxAverage(int[] nums, int k) {

      double sum=0;
      int low=0;
      double res=Integer.MIN_VALUE;

      for(int high=0;high<nums.length;high++){
        sum+=(double)nums[high];

        while(high-low+1 > k){
            sum-=(double)nums[low];
            low++;
        }
        if(high-low+1==k){
            double avg=(double)sum/k;
            res=Math.max(res,avg);
            
        }

      }
      return res;
        
    }
}