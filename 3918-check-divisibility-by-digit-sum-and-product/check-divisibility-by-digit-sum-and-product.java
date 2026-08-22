class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(num>0){
            int last=num%10;
            sum+=last;
            product*=last;
            num=num/10;
        }
        int total=sum+product;
        return n%total==0;
        
        
    }
}