class Solution {
    public boolean checkGoodInteger(int n) {
        if(squaresum(n)-sum(n)>=50){
            return true;
        }
        return false;
        
        
    }
    int squaresum(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            int sq=last*last;
            sum=sum+sq;
            n=n/10;
        }
        return sum;
    }
     int sum(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
        }
        return sum;
    }
}