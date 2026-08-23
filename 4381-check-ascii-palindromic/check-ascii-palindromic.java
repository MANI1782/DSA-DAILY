class Solution {
    public boolean isPalindromic(String s) {
            StringBuilder sb=new StringBuilder();
            for(char ch:s.toCharArray()){
                int find=(int)ch;
                String ans = String.format("%8s", Integer.toBinaryString(ch)).replace(' ', '0');
                sb.append(ans);
            }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
        
        
    }
}