class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        track(0,1,res,curr,k,n);
        return res;
        
    }
    void track(int sum,int idx,List<List<Integer>> res,List<Integer> curr,int k,int n){
        if(curr.size()==k){
            if(sum==n){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=idx;i<=9;i++){
            sum=sum+i;
            curr.add(i);
            track(sum,i+1,res,curr,k,n);
            curr.remove(curr.size()-1);
            sum=sum-i;
        }
    }
}