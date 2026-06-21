class Solution {
    public int maxDistance(String moves) {

        int x=0;
        int y=0;
        int underscore=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                x--;
            }if(ch=='U'){
               y++;
            }if(ch=='_'){

                underscore++;
            }if(ch=='D'){
                y--;
            }if(ch=='R'){
                x++;
            }
        }
        return Math.abs(0-Math.abs(x))+Math.abs(0-Math.abs(y))+underscore;
        
    }
}