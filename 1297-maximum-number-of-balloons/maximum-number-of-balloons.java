class Solution {
    public int maxNumberOfBalloons(String text) {
      char b='b';
      char a='a';
      char l='l';
      char o='o';
      char n='n';

      int bcount=0;
      int acount=0;
      int lcount=0;
      int ocount=0;
      int ncount=0;

      for(char ch:text.toCharArray()){
        if(ch==b){
            bcount++;
         }if(ch==a){
            acount++;
         }if(ch==l){
            lcount++;
         }
         if(ch==o){
            ocount++;
         }
         if(ch==n){
            ncount++;
         }
      }
      return Math.min(bcount,Math.min(acount,Math.min(lcount/2,Math.min(ocount/2,ncount))));
        
    }
}