class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
       int max=Integer.MIN_VALUE;
        int low=0;
        for(int high=0;high<nums.length;high++){

            map.put(nums[high],map.getOrDefault(nums[high],0)+1);

            while(map.get(nums[high])>k){

                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;

            }
            max=Math.max(max,high-low+1);




        }
        return max;
        
    }
}