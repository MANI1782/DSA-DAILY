class Solution {
    public int sumOfGoodIntegers(int n, int k) {

        int sum=0;  //n=6  k=2
        int x=1;
    
        while(true){
            if(Math.abs(n-x)<=k && (n & x) ==0){
                sum=sum+x;
            }
           if (x > n + k) {
                break;
            }
            x++;
        }
        return sum;

        
    }
}