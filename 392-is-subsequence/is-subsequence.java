class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
       
        int tSize=t.length();
        int i=0;
        for(int j=0;j<tSize;j++){
            char right=t.charAt(j);
            char left=s.charAt(i);


            if(left==right){
                i++;
            }  
            if(i==s.length()){
                return true;
            } 
        }
        return false;
    }
}