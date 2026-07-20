class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder contains=new StringBuilder();
        StringBuilder notContains=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch==x){
                contains.append(ch);
            }else{
                notContains.append(ch);
            }
        }

        notContains.append(contains);

        return notContains.toString();

        
    }
}