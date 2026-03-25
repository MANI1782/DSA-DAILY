class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            char dot='.';
            if(ch==dot){
                String replace="[.]";
                ans=ans+replace;
            }else{
                ans=ans+ch;

            }
        }
        return ans;
    }
}