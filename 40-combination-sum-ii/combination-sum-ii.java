class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        track(candidates,0,curr,res,0,target);
        return res;
        
    }

    void track(int nums[],int idx,List<Integer> curr,List<List<Integer>> res,int sum,int target){  
        
            if(sum==target){
                res.add(new ArrayList<>(curr));
                 return;
            }
           
        
        for(int i=idx;i<nums.length;i++){
           if (i > idx && nums[i] == nums[i - 1]){
            continue;
           }
            if (sum + nums[i] > target) break;  
            else{
                curr.add(nums[i]);
                sum=sum+nums[i];
                track(nums,i+1,curr,res,sum,target);
                curr.remove(curr.size()-1);
                sum=sum-nums[i];
            }
        }
    }
}