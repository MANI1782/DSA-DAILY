class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list=new ArrayList<>(); // 3,4,8,9,10
        Arrays.sort(nums);
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        
        int i=nums.length-1;
        int count=0;
        while(count<=sum){
            sum=sum-nums[i];
            list.add(nums[i]);
           
            count=count+nums[i];
            i--;
        }   
        
        return list;
        

        
    }
}