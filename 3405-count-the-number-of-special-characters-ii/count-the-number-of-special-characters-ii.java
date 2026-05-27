class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower=new int[26];
        int[] higher=new int[26];

        for(int i=0;i<26;i++){
            lower[i]=-1;
            higher[i]=-1;
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch-'a']=i;
            }else{
                if(higher[ch-'A']==-1){
                    higher[ch-'A']=i;
                }
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(lower[i]!=-1 && higher[i]!=-1  && lower[i]<higher[i]){
                count++;
            }
        }
        return count;
        
    }
}