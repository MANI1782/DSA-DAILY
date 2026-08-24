class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        check(candidates,0,curr,list,0,target);
        return list;
    }
    void check(int[] nums,int idx,List<Integer> curr,List<List<Integer>> list,int sum,int target){
        if(nums.length==idx){
            if(sum==target){
            list.add(new ArrayList<>(curr));
            }
            return;
        }
        check(nums,idx+1,curr,list,sum,target);
        if(nums[idx]+sum<=target){
            curr.add(nums[idx]);
            sum=sum+nums[idx];
            check(nums,idx,curr,list,sum,target);
            curr.remove(curr.size()-1);
            sum=sum-nums[idx];
        }
    }
}