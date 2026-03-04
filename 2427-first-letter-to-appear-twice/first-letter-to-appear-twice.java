class Solution {
    public char repeatedCharacter(String s) {
        Map<Character,Integer> ans=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char leftchar=s.charAt(i);

            ans.put(leftchar,ans.getOrDefault(leftchar,0)+1);

            if(ans.get(leftchar)>1){
                
                return leftchar;
            }
        }
        return ' ';
        
    }
}