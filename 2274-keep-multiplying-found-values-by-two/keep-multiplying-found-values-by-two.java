class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res=original;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1); // 5-1 
        }
        for(int num:map.keySet()){
            if(map.containsKey(res)){
                res=res*2;
            }
        }
        return res;
        
    }
   
}