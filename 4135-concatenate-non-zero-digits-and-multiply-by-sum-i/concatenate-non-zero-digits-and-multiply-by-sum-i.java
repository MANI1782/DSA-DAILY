class Solution {
    public long sumAndMultiply(int n) {
        long sum=sumfind(n);
        int find=rev(n);
        return sum*(long)find;
        

        
    }
    long sumfind(int n){
        long sum=0;
        while(n>0){
            int last=n%10;
            sum=sum+(long)last;
            n=n/10;
        }
        return sum;

    }
    int rev(int n){
        int sum=0;
        int res=0;
        while(n>0){
            int last=n%10;
            if(last!=0){
            sum=(sum*10)+last;
            
            }
            n=n/10;
        }
        while(sum>0){
            int last=sum%10;
            res=(res*10)+last;
            sum=sum/10;
        }
        return res;
    
    }

}