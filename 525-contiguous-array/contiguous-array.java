class Solution {
    public int findMaxLength(int[] nums) {
        int zero=0;
        int one=0;
        int res=0;
        Map<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            zero++;
        }else{
            one++;
        }
        int diff=one-zero;
        if(diff==0){
            res=Math.max(res,i+1);
            continue;
        }
        if(ans.containsKey(diff)){
            int index=ans.get(diff);
            int length=i-index;
            res=Math.max(res,length);
           
        }else{
            ans.put(diff,i);
        }
        } 
        return res; 
    }
}