class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int arr:nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        for(int arr:nums){
            if(map.get(arr)==1){
                sum=sum+arr;
            }
        }
        return sum;
        
    }
}