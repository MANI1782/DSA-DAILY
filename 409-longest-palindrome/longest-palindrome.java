class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        boolean oddcount=false;

        for (char ch : map.keySet()) {
            int val=map.get(ch); // ✅
            if(val%2==0){
                count=count+val;
            }else{
                count=count-1+val;
                oddcount=true;
            }
        }
        if(oddcount){
            count=count+1;
        }
       

        return count;

    }
}