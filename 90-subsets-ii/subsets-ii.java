class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        track(nums,0,curr,res);
        return res;
        
    }
    void track(int nums[],int idx,List<Integer> curr,List<List<Integer>> res){
        
            res.add(new ArrayList<>(curr));
            
        
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
               continue;
            }else{
                 curr.add(nums[i]);
                track(nums,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }
    }
}