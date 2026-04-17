class Solution {
    public int minMirrorPairDistance(int[] nums) {
    Map<Integer,Integer> map=new HashMap<>();
       
       int res=Integer.MAX_VALUE;
      
      int i=0;
      while(i<nums.length){
        int num=nums[i];
        int r=rev(num);
        if(map.containsKey(num)){
            res=Math.min(res,Math.abs(i-map.get(num)));
        }
        map.put(r,i);
        i++;
      }
      return res==Integer.MAX_VALUE?-1:res;
       
        
    }
    int rev(int n){
        while(n%10==0 && n>0){
            n=n/10;
        }
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=(sum*10)+last;
            n=n/10;
        }
        return sum;
    }
}