class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sorted[]=nums.clone();
        Arrays.sort(sorted);
       Map<Integer,Integer> ans=new HashMap<>();
       for(int i=0;i<sorted.length;i++){
        ans.putIfAbsent(sorted[i],i);
       }
       int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=ans.get(nums[i]);
        }
        return res;
    }
}