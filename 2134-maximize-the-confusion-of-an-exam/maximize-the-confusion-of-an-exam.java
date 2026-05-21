class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int res=0;
        int low=0;
        int maxfreq=0;
        for(int high=0;high<answerKey.length();high++){
            char ch=answerKey.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));

            while(high-low+1 -maxfreq>k ){
                char c=answerKey.charAt(low);
                map.put(c,map.get(c)-1);
                low++;
            }
            res=Math.max(res,high-low+1);

        }
        return res;
        
    }
}