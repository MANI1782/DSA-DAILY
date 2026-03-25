class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> res=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            if(!res.contains(ch)){
                res.add(ch);
            }
        }
        for(char ch:stones.toCharArray()){
            if(res.contains(ch)){
                count++;
            }
        }
        return count;
        
        
    }
}