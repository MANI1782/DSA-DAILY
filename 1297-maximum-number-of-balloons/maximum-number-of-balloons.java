class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // ✅ Only these lines changed!
        int b = map.getOrDefault('b', 0) / 1;
        int a = map.getOrDefault('a', 0) / 1;
        int l = map.getOrDefault('l', 0) / 2; // needs 2 l's
        int o = map.getOrDefault('o', 0) / 2; // needs 2 o's
        int n = map.getOrDefault('n', 0) / 1;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n)))); // ✅
    }
}