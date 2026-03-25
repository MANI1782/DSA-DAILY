class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Map<Character,Integer> res=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            res.put(ch,res.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char left=jewels.charAt(i);
            if(res.containsKey(left)){
                count=count+res.get(left);
            }
            
        }
        return count;
        
    }
}