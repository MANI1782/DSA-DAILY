class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count=0;
        int rcount=0;
        int lcount=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='_'){
                count++;
            }
            if(ch=='L'){
                lcount++;
            }
            if(ch=='R'){
                rcount++;
            }
        }
        return Math.abs(lcount-rcount)+count;
        
    }
}