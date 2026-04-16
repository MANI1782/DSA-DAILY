class Solution {
    public int countKeyChanges(String s) {
        String ans=s.toLowerCase();

        int i=0;
        int count=0;
        while(i<ans.length()){
            char ch=ans.charAt(i);

            if(i>0 && ch!=ans.charAt(i-1)){
                count++;
            }
            i++;


        }
        return count;
        
    }
}