class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> ans=new ArrayList<>();
       Map<Integer,Integer> map=new HashMap<>();
       for(int arr:nums){
        map.put(arr,map.getOrDefault(arr,0)+1);
       }
       int max=0;
       int min=Integer.MAX_VALUE;
       for(int arr:nums){
        min=Math.min(min,arr);
        max=Math.max(max,arr);
       }
       for(int i=min;i<=max;i++){
        if(!map.containsKey(i)){
            ans.add(i);
        }
        
       }
       return ans;

        
        
        
    }
}