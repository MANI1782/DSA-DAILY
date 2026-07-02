class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        combination(candidates,0,0,ans,res,target);
        return res;
        
    }
    void combination(int arr[],int idx,int sum,List<Integer> dairy,List<List<Integer>> res,int target){
        if(idx==arr.length){
            if(sum==target){
                res.add(new ArrayList<>(dairy));
            }
            return ;
        }
        combination(arr,idx+1,sum,dairy,res,target);
        if(arr[idx]+sum<=target){
            dairy.add(arr[idx]);

            sum=sum+arr[idx];

            combination(arr,idx,sum,dairy,res,target);
            dairy.remove(dairy.size()-1);
            sum=sum-arr[idx];
        }
    }
}