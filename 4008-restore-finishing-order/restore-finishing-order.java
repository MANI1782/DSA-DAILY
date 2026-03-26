class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<friends.length;i++){
            map.put(friends[i],map.getOrDefault(friends[i],0)+1);
        }
        int idx=0;
        for(int i=0;i<order.length;i++){
            if(map.containsKey(order[i])){
                ans[idx]=order[i];
                idx++;
            }
        }
        return ans;
        
    }
}