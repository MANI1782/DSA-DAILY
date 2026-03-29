class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        int count=0; //4
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)%k==0){
                int ans=map.get(num)*num;
                count=count+ans;
            }
        }
        return count;
        
    }
}