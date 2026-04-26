class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Integer> list=new ArrayList<>(map.keySet());

       Collections.sort(list);

       for(int i=0;i<list.size();i++){
        int num1=list.get(i);
        int freq=map.get(num1);
        for(int j=i+1;j<list.size();j++){
            int num2=list.get(j);
            int freq1=map.get(num2);

            if(num1<num2 && freq!=freq1){
                return new int[]{num1,num2};
            }
        }
       }
       return new int[]{-1,-1};
        
    }
}
