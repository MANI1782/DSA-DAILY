class Solution {
    public int minimumCost(int[] cost) {
        // 2 2 5 6 7 9
        Arrays.sort(cost);  // 1 3 3 3
                              //3  2  1 0
      
        int sum=0;
        int times=0;
     for(int i=cost.length-1;i>=0;i--){
        
        if(times==2){
            times=0;
            continue;
        }
        sum=sum+cost[i];
       
        times++;
     }
        
    
      
      return sum;
        
      
      
        
    }
}