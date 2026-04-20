class Solution {
    public boolean isFascinating(int n) {
        if(n%10==0){
            return false;
        }
        Set<Integer> set=new HashSet<>();
        int num=n;
        int ans1=n*2;
        int ans2=n*3;
        while(num>0){
            int last=num%10;
            set.add(last);
            num=num/10;
        }
        if(ans1>999){
            return false;
        }
        if(ans2>999){
            return false;
        }
        
        while(ans1>0){
            int last=ans1%10;
            set.add(last);
            ans1=ans1/10;
        }
        while(ans2>0){
            int last=ans2%10;
            set.add(last);
            ans2=ans2/10;
        }
        int zero=0;
        while(n>0){
            int last=n%10;
            if(!set.contains(last) || set.contains(zero)){
                return false;
            }
            n=n/10;
        }
        return set.size()==9;

        
    }
}