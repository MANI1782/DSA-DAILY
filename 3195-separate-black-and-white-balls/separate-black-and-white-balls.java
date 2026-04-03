class Solution {
    public long minimumSteps(String s) {
        long onecount=0;
        long zerocount=0;

        for(char ch:s.toCharArray()){
            char one='1';
            char zero='0';
            

            if(ch==one){
                onecount+=1;
            }if(ch==zero){
                zerocount=zerocount+onecount;
            }

        }
        return zerocount;


       
        
    }
}