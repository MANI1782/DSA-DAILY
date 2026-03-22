class Solution {
    public String toLowerCase(String s) {
        char[] ans=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ans[i]=(char)(ch+32);
            }else{
                ans[i]=ch;
            }
        }
        return new String(ans);
        
    }
}