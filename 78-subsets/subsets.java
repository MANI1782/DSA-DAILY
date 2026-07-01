class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,0,ans,new ArrayList<>());
        return ans;
        
    }

    void subset(int arr[],int idx,List<List<Integer>> list,List<Integer> curr){
        if(arr.length==idx){
            list.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[idx]);
        subset(arr,idx+1,list,curr);
        curr.remove(curr.size()-1);
        subset(arr, idx + 1, list, curr);

        
        
    }
}