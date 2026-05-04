class Solution {
    public int sumOfPrimesInRange(int n) {
        int num=n; //10  //10
        int sum=0; //rev  01
        while(num>0){
            int last=num%10;
            sum=(sum*10)+last; //01
            num=num/10;
        }
        int count=0;
        int min=Math.min(sum,n);
        int max=Math.max(sum,n);
        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                count=count+i;
            }
        }
        return count;
        
    }
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
       
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
           
        }
        return true;
    }
}