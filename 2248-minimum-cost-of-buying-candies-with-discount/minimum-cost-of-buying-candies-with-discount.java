class Solution {
    public int minimumCost(int[] cost) {
        // 2 2 5 6 7 9
        Arrays.sort(cost);  // 1 3 3 3
                              //3  2  1 0
      int i=cost.length-1;
        int sum=0;
        int times=0;
      while(i>=0){
        sum=sum+cost[i];
        i--;
        times++;
        if(times%2==0){
            times=0;
            i=i-1;
        }
        
      
      }
      return sum;
        
      
      
        
    }
}