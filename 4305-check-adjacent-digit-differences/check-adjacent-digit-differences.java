class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int i=0;
        int j=1;
        while(j<s.length()){
            int num1=s.charAt(i)-'0';
            int num2=s.charAt(j)-'0';
            int res=Math.abs(num2-num1);
            if(res<=2){
                i++;
                j++;
            }else{
                return false;
            }

        }
        return true;
        
    }
}