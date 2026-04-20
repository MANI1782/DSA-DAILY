class Solution {
    public int subtractProductAndSum(int n) {
        return prod(n)-sum(n);
        
    }
    int prod(int n){
        int sum=1;
        while(n>0){
            int last=n%10;
            sum=sum*last;
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