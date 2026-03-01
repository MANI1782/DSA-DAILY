class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);

            ans.put(left,ans.getOrDefault(left,0)+1);
        }
        return ans.size();
        
    }
}