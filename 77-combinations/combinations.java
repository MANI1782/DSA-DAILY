class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        track(n,k,1,curr,res);
        return res;
    }
    void track(int n,int k,int idx,List<Integer> curr,List<List<Integer>> res){
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<=n;i++){
            curr.add(i);
            track(n,k,i+1,curr,res);
            curr.remove(curr.size()-1);


        }

    }
}