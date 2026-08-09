class Solution {
    public double minPrice(int[] prices, int[] discounts) {

        double sum=0; // 30 21 10     60 50
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i=prices.length-1;
        int j=discounts.length-1;
        while(j>=0 && i>=0){
           double res = (prices[i] * (100.0 - discounts[j])) / 100.0;

            sum=sum+res;
            i--;
            j--;
        }
        while(i>=0){
            sum=sum+(double)prices[i];
            i--;
        }
        return sum;
        
    }
}