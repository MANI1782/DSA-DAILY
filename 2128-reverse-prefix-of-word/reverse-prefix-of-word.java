class Solution {
    public String reversePrefix(String word, char c) {
      
        return rev(word,c);
    }

    String rev(String s,char c){

        StringBuilder sb=new StringBuilder();
        int idx=s.indexOf(c);
        for(int i=idx;i>=0;i--){
            char left=s.charAt(i);
            sb.append(left);

        }
        for(int i=idx+1;i<s.length();i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}