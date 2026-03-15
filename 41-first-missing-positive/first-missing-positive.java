class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int found=Integer.MIN_VALUE;
       
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        

    return -1;
        
    }
}