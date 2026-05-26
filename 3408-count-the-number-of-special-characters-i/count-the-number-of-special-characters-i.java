class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new HashSet<>();
        int count=0;

        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        for(char ch='a';ch<='z';ch++){
            char lower=Character.toLowerCase(ch);
            char upper=Character.toUpperCase(ch);
            if(set.contains(lower) && set.contains(upper)){
                count++;
            }
        }
        return count;
        



        
    }
}

// a A b c B C //unoreded ch