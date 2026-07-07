class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        if(n==0){
            return 0;
        }
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int last=n%10;
            sum=sum+(long)last;
            if(last!=0){
            sb.append(String.valueOf(last));
            }
            n=n/10;
        }
        sb.reverse();
        String ans=sb.toString();
        int res=Integer.parseInt(ans);
        return sum*(long)res;

        
    }
}