class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=-1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==arr[i]){
                
                res=Math.max(arr[i],res);
            }
           
        }
        if(res==Integer.MIN_VALUE){
            return -1;
        }else{
        return res;
        }
        
    }
}