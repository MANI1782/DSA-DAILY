class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer,Integer> map1=new HashMap<>();
         Map<Integer,Integer> map2=new HashMap<>();
        return check(nums,k,map1)-check(nums,k-1,map2);
        
    }
    int check(int nums[],int k,Map<Integer,Integer> map){
        int count=0;
        int low=0;
        for(int high=0;high<nums.length;high++){
            map.put(nums[high],map.getOrDefault(nums[high],0)+1);

            while(map.size()>k){
                map.put(nums[low],map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
            }
            if(map.size()<=k){
                count=count+(high-low+1);
            }
        }
        return count;
        
    }
}