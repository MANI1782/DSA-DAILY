class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean used[]=new boolean[nums.length];
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        track(nums,ans,res,used);
        return res;
        
        
    }
    void track(int nums[],List<Integer> curr,List<List<Integer>> res,boolean used[]){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            curr.add(nums[i]);
            track(nums,curr,res,used);
            curr.remove(curr.size()-1);
            used[i]=false;
            }
            
        
    }
}