class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();

        track(k,n,1,curr,res,0);
        return res;
        
    }
    void track(int k,int n,int idx,List<Integer> curr,List<List<Integer>> res,int sum){
        if(curr.size()==k && sum==n){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<=9;i++){
            curr.add(i);
            sum=sum+i;
            track(k,n,i+1,curr,res,sum);
            sum=sum-i;
            curr.remove(curr.size()-1);

        }
    }
}