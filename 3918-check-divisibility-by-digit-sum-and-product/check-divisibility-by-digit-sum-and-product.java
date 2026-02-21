class Solution {
    public boolean checkDivisibility(int n) {
        int sum=sumAns(n)+productAns(n);
        if(n%sum==0){
            return true;
        }
        return false;
        
    }

   static int sumAns(int n){
        int sum=0;
        while(n!=0){
            int lastdigit=n%10;
            sum=sum+lastdigit;
            n=n/10;
        }
        return sum;
    }


    static int productAns(int n){
        int product=1;
        while(n!=0){
            int lastdigit=n%10;
            product=product*lastdigit;
            n=n/10;
        }
        return product;
    }
}
