class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }
            if(ch=='*'){
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length()-1);
                }else{
                    continue;
                }
            }
            if(ch=='#'){
                String ans=sb.toString();
                sb.append(ans);
            }
            if(ch=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
        
    }
}