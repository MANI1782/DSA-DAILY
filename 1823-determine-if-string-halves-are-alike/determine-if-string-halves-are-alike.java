class Solution {
    public boolean halvesAreAlike(String s) {

        int i=0;
        int j=s.length()-1;
        int icount=0;
        int jcount=0;
        String str=s.toLowerCase();


        while(i<j){
         char left=str.charAt(i);
         char right=str.charAt(j);

         if(left=='a'|| left=='e' || left=='i'||  left=='o' || left=='u'){
            icount+=1;
         }
         i++;

        if(right=='a'|| right=='e' || right=='i'||  right=='o' || right=='u'){
            jcount+=1;
         }
         j--;

        }
        return jcount==icount;
        
    }
}