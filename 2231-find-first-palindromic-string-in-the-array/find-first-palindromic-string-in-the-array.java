class Solution {
    public String firstPalindrome(String[] words) {

        StringBuilder sb=new StringBuilder();

        for(String s:words){
            String rev=new StringBuilder(s).reverse().toString();
            if(rev.contains(s)){
                sb.append(s);
                break;
            }
        }
        return sb.toString();
        
    }
}