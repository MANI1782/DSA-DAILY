class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character, Integer> target = new HashMap<>();
        for (char c : s1.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int low = 0;
        int k=s1.length();

        for (int high = 0; high < s2.length(); high++) {
            char ch = s2.charAt(high);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
                
                while(high-low+1>k){
                    char leftchar=s2.charAt(low);
                    if(window.get(leftchar)==1){
                        window.remove(leftchar);
                    }else{

                    window.put(leftchar,window.get(leftchar)-1);
                }
                    low++;
                }
                if(window.equals(target)){
                    return true;
                }

        }
        return false;
}
}