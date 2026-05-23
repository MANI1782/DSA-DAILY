class Solution {
    public boolean checkString(String s) {
        int i=0;
        int j=1;
        while(i<s.length() && j<s.length()){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1=='b' && ch2=='a'){
                return false;
            }
            i++;
            j++;



        }
        return true;
        
    }
}