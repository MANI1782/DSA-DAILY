class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(String ans:words){
        StringBuilder temp = new StringBuilder(ans);
        temp.reverse();
        res.append(temp).append(" ");
        }
        return res.toString().trim();

        
    }
    
}