class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                one++;
            }else{
                zero++;
            }

            int diff=one-zero;
            if(diff==0){
                res=Math.max(res,i+1);
                continue;
            }
            if(map.containsKey(diff)){
                int idx=map.get(diff);
                res=Math.max(res,i-idx);
            }else{
                map.put(diff,i);
            }
        }
        return res;
    }
}