class Solution {
    public double minimumAverage(int[] nums) {
        double min=Double.MAX_VALUE;
        int n=nums.length;

        Arrays.sort(nums);

        int i=0;
        int j=nums.length-1;
        while(i<j){
            double avg=(nums[i]+nums[j])/2.0;
            min=Math.min(min,avg);
            i++;
            j--;
           
        }
        return min;
        
    }
}