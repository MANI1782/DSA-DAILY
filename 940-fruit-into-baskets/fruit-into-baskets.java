class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int res=Integer.MIN_VALUE;
        Map<Integer,Integer> ans=new HashMap<>();

        for(int high=0;high<fruits.length;high++){
            ans.put(fruits[high],ans.getOrDefault(fruits[high],0)+1);

            while(ans.size()>2){
                ans.put(fruits[low],ans.get(fruits[low])-1);

                if(ans.get(fruits[low])==0){
                    ans.remove(fruits[low]);
                }
                low++;
            }
            res=Math.max(res,(high-low)+1);
            
            
        }
        return res;
    }
}