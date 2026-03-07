class Solution {
    public int rearrangeCharacters(String s, String target) {
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char left=s.charAt(i);
            map.put(left,map.getOrDefault(left,0)+1);
        }
         Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<target.length();i++){
            char left=target.charAt(i);
            
            map1.put(left,map1.getOrDefault(left,0)+1);
            
        }
        int ans=Integer.MAX_VALUE;
        for(char ch:map1.keySet()){
            int smap=map.getOrDefault(ch,0);
            int tmap1=map1.get(ch);
            ans=Math.min(ans,smap/tmap1);
        }
        return ans;
  
        
    }
}