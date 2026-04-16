class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums); //0 1 3 4 4 5 

        Set<Double> set=new HashSet<>();
        double ans=0;
        int count=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            double avg=(double)(nums[i]+nums[j])/2;
            set.add(avg);
            i++;
            j--;
        
      
    }
    return set.size();
    }

}