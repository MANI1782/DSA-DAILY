class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[arr.length];
        int idx=0;
        int count=1;
        int[] nums=arr.clone();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                map.put(nums[i],count);
                count++;
            }else{
                map.put(nums[i],count-1);
            }
            set.add(nums[i]);

        }
        for(int i=0;i<arr.length;i++){
            ans[idx]=map.get(arr[i]);
            idx++;

        }
        return ans;

        
    }
}