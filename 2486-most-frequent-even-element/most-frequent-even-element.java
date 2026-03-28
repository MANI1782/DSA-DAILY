class Solution {
    public int mostFrequentEven(int[] nums) {
        int max=-1;
        int ans=-1;

        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int num:map.keySet()){
            if(num%2==0){
                int freq=map.get(num);
                if(freq>max || (freq==max && num<ans)){
                 max=freq;
                 ans=num;   
                    
                }
            }
        }
        return ans;
        
    }
}