class Solution {
    public boolean judgeSquareSum(int c) {
        List<Long> ans=new ArrayList<>();
        for(long i=0;i<=Math.sqrt(c);i++){
            ans.add(i);
        }
        int left=0;
        int right=ans.size()-1;
        
        
        while(left<=right){
                long a=ans.get(left);
                long b=ans.get(right);
                long sum=(a*a)+(b*b);
            if(sum==c){
                return true;
            }
            if(sum>c){
                right--;
            }else if(sum<c){
                    left++;
            }    
        }
        return false;

        
    }
}