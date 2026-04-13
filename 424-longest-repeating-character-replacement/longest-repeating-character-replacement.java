
import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer> map=new HashMap<>();
      int maxfreq=0;
      int low=0;
      int res=0;

    for(int high=0;high<s.length();high++){
        char ch=s.charAt(high);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,map.get(ch));

        while(high-low+1 - maxfreq > k ){
            char left=s.charAt(low);
            map.put(left,map.get(left)-1);
            low++;
        }
        res=Math.max(res,high-low+1);
    }
    return res;

    }
}