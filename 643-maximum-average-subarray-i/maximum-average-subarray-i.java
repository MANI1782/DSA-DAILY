class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum=0;
        for(int high=0;high<k;high++){
            sum=sum+(double)nums[high]/k;
        }
        int low=0;
        int high=k;
        double res=sum;
        while(high<nums.length){
            sum=sum+(double)nums[high]/k;
            sum=sum-(double)nums[low]/k;
            
            low++;
            high++;
            res=Math.max(res,sum);
        }
        
   
       
       
       return res;
        
    }
}