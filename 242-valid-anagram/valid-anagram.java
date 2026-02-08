class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> freq1=new HashMap<>();
        Map<Character,Integer> freq2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char leftChar=s.charAt(i);
            freq1.put(leftChar,freq1.getOrDefault(leftChar,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char rightchar=t.charAt(i);
            freq2.put(rightchar,freq2.getOrDefault(rightchar,0)+1);
        }
        if(freq1.equals(freq2)){
             return true;
        }
return false;
    
    }
}