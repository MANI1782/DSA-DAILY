class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int idx=nums.length/2;
        for(int i=0;i<nums.length;i++){
           
            if(i==idx){
                continue;
            }else{
                set.add(nums[i]);
            }
        }
        
        if(set.contains(nums[idx])){
            return false;
        }
        return true;
        
    }
}