class Solution {
    public boolean judgeCircle(String moves) {
        int ucount=0;
        int dcount=0;
        int lcount=0;
        int rcount=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                ucount+=1;
            }
            if(ch=='D'){
                dcount+=1;
            }if(ch=='L'){
                lcount+=1;
            }if(ch=='R'){
                rcount+=1;
            }
        }
        if(lcount==rcount && ucount==dcount){
            return true;
        }
        else{
            return false;
        }
        
    }
}