class Solution {
    public int minOperations(String s1, String s2) {
        int ans=0;

        if(s1.length()==1 && s1.equals("1") &&  s2.equals("0")){
            return -1;
        }
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            if(ch1=='0' && ch2=='1'){
                ans++;
            }else if(ch1=='1' && ch2=='0'){
                if(i+1<s2.length() && s1.charAt(i+1)=='1' && s2.charAt(i+1)=='0'){
                    ans++;
                    i++;
                }else{
                    ans=ans+2;
                }
            }


        }
        return ans;
        
    }
}