class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      for(int ans:map.keySet()){
        if(map.get(ans)==n/2){
            res=ans;
        }
      }
        return res;
    }
}