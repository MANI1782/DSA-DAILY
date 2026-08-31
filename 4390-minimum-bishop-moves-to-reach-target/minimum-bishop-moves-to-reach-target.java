class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int start1=source[0];
        int start2=source[1];
        int end1=target[0];
        int end2=target[1];
        int oddcount=0;
        int evencount=0;

        for(int i=0;i<source.length;i++){
            if(source[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
         for(int i=0;i<target.length;i++){
            if(target[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }

        if(evencount%2!=0 && evencount%2!=0){
            return -1;
        }
       if(Math.abs(start1-end1)==Math.abs(start2-end2)) return 1;
        return 2;

        
    }
}