class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
                if(getLast(i)==true){
                    ans.add(i);
                }
        }
        return ans;
    }
    public boolean getLast(int n){
        int temp=n;
        while(temp>0){
            int lastdigit=temp%10;
            if(lastdigit==0 || n%lastdigit!=0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
}