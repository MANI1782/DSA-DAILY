class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        
        int count=0;
        for(int num:nums){
          map.put(num,map.getOrDefault(num,0)+1);  
        }
        for(int num:nums){
            int com=num-k;

            if(map.containsKey(com)){
                count=count+map.get(com);
            }
        }
        return count;
        
    }
}