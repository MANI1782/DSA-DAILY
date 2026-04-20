class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int low=0;
        int res=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for(int high=0;high<nums.length;high++){
            sum+=nums[high];
            if(map.containsKey(sum-goal)){
                res=res+map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return res;
        
    }
}