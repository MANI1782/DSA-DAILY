class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        permutation(nums,res,list);
        return res;

        
        
    }
    void permutation(int arr[],List<List<Integer>> list,List<Integer> curr){
        if(curr.size()==arr.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(curr.contains(arr[i])){
                continue;
            }else{
                    curr.add(arr[i]);
                    permutation(arr,list,curr);
                    curr.remove(curr.size()-1);
            }
        }
        

    }
}