class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int res=Integer.MIN_VALUE;
        int low=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int high=0;high<nums.length;high++){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high])>k){
                map.put(nums[low],map.get(nums[low])-1 );
                low++;
            }
            if(map.get(nums[high])<=k){
                res=Math.max(res,high-low+1);
            }
        }
        return res;
        
    }
}