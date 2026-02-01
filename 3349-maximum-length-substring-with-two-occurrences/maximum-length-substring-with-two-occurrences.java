class Solution {
    public int maximumLengthSubstring(String s) {
        int low=0;
        int res=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            while(freq.get(ch)>2){
                char leftchar=s.charAt(low);
                freq.put(leftchar,freq.get(leftchar)-1);
                low++;
            }

            res=Math.max(res,high-low+1);
        }
        return res;

    }
}