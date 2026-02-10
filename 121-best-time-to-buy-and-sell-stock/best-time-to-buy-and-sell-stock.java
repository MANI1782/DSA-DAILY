class Solution {
    public int maxProfit(int[] prices) {
    
        int max=0;
        int i=0;
        int j=1;
        
        while(j<prices.length){
            if(prices[i]>prices[j]){
                i=j;
            }else{
                int profit=prices[j]-prices[i];
                max=Math.max(profit,max);

            }
            j++;
         
    }
    return max;
}
}