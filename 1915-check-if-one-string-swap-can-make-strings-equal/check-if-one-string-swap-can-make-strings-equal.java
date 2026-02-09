class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character,Integer> freq1=new HashMap<>();
        Map<Character,Integer> freq2=new HashMap<>();
        int diff=0;

        for(int i=0;i<s1.length();i++){
            char leftchar=s1.charAt(i);
            freq1.put(leftchar,freq1.getOrDefault(leftchar,0)+1);
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
            
        }
        for(int i=0;i<s2.length();i++){
            char rightchar=s2.charAt(i);
            freq2.put(rightchar,freq2.getOrDefault(rightchar,0)+1);
        }
    if(freq1.equals(freq2) && diff<=2){
        return true;
    }
    return false;

    }
}