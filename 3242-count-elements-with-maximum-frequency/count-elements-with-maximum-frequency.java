class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int num:map.keySet()){
            if(map.get(num)>max){
                max=map.get(num);
            }
        }
        for(int num:map.keySet()){
            if(map.get(num)==max){
                count=count+map.get(num);
            }
        }
        return count;

        
    }
}