class Solution {
    public long gcdSum(int[] nums) {
        int[] res=new int[nums.length];
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int num:nums){
            max=Math.max(num,max);
           
            int find=gcd(max,num);
            res[idx]=find;
            idx++;          
        }
        Arrays.sort(res);
        int i=0;
        int j=res.length-1;
        long sum=0;
        while(i<j){
            int gcd=gcd(res[i],res[j]);
            sum=sum+gcd;
            i++;
            j--;
        }
        return sum;
   
    }
    int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
