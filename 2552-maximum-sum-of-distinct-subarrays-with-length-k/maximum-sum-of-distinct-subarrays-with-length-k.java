class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int low=0;
        long max=0;
        long sum=0;
        for(int high=0;high<nums.length;high++){
            int ch=nums[high];
            map.put(ch,map.getOrDefault(ch,0)+1);
            sum=sum+ch;
       


            while(high-low+1>k ){
                int lower=nums[low];
                sum=sum-lower;

                map.put(lower,map.get(lower)-1);
                
                
                if(map.get(lower)==0){
                    map.remove(lower);
                }
                
                low++;
            }
            if (high - low + 1 == k && map.size() == k) {
                max = Math.max(max, sum);
            }
            
        }
        return max;
        
    }
}