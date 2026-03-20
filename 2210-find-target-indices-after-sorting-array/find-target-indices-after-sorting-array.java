class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int small=0;
        int tcount=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]<target){
                small++;
            } if(nums[i]==target){
                tcount++;
            }
           
        }
        while(tcount!=0){
            ans.add(small++);
            tcount--;
        }
        return ans;
    }
}