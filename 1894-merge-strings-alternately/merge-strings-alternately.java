class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            char left=word1.charAt(i);
            char right=word2.charAt(j);

            sb.append(left);
            i++;
            sb.append(right);
            j++;

        }
        while(i<word1.length()){
            char left=word1.charAt(i);
            sb.append(left);
            i++;
        }
         while(j<word2.length()){
            char left=word2.charAt(j);
            sb.append(left);
            j++;
        }
        return sb.toString();
        
    }
}