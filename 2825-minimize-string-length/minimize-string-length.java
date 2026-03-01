class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> ans=new HashSet<>();
        for(int i=0;i<s.length();i++){
        char left=s.charAt(i);
            if(!ans.contains(left)){
                ans.add(left);
            }
        }
        return ans.size();
        
    }
}