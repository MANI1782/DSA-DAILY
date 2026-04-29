class Solution {
    public String getEncryptedString(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt((i+k)%s.length());
            
            sb.append(ch);
        }
        return sb.toString();
        
    }
}