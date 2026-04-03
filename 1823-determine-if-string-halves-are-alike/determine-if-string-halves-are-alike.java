class Solution {
    public boolean halvesAreAlike(String s) {

        int i=0;
        int j=s.length()-1;
        int icount=0;
        int jcount=0;
        String vowels="AEIOUaeiou";


        while(i<j){
         char left=s.charAt(i);
         char right=s.charAt(j);

         if(vowels.indexOf(left)!=-1){
            icount++;
         }
         i++;
         if(vowels.indexOf(right)!=-1){
            jcount++;
         }
         j--;

       
        

        }
        return jcount==icount;
        
    }
}