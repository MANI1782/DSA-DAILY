class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int row=0;row<accounts[i].length;row++){
                sum=sum+accounts[i][row];

                if(sum>max){
                    max=sum;
                }

            }
        }
        return max;
    }
}