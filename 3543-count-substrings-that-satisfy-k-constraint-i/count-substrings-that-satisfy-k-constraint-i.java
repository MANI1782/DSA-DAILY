class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int low=0,zero=0,one=0;
        int res=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            if(ch=='0'){
                zero++;
            }else{
                one++;
            }

            while(zero > k && one > k){
                char cha=s.charAt(low);
                if(cha=='0'){
                    zero--;
                }else{
                    one--;
                }
                low++;
            }
            res+=high-low+1;

        }
        return res;
        
    }
}