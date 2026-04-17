class Solution {
    public int minimumDistance(int[] nums) {
        int low=0;
        Map<Integer,List<Integer>> map=new HashMap<>();
        int res=Integer.MAX_VALUE;
        for(int high=0;high<nums.length;high++){
            map.putIfAbsent(nums[high],new ArrayList<>());
            List<Integer> list=map.get(nums[high]);
            list.add(high);

            if(list.size()>3){
                list.remove(0);
            }
            if(list.size()==3){
                res=Math.min(res,Math.abs(list.get(0)-list.get(1) )+Math.abs(list.get(1)-list.get(2)) +Math.abs(list.get(2)-list.get(0)));
            }
            

        }
        return res==Integer.MAX_VALUE?-1:res;
        
    }
}