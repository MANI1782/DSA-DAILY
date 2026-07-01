class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        subset(nums,0,ans,new ArrayList<>());
        return ans;
        
    }

    void subset(int arr[],int idx,List<List<Integer>> list,List<Integer> curr){
        
            list.add(new ArrayList<>(curr));
         

        for(int i=idx;i<arr.length;i++){
            curr.add(arr[i]);
            subset(arr,i+1,list,curr);
            curr.remove(curr.size()-1);
        }

        
        
    }
}