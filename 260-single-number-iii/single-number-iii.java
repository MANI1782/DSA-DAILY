class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans1=new int[2];
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);

        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(ans.get(nums[i])==1){
                ans1[k]=nums[i];
                k++;
            }
        }
        return ans1;

        
    }
}