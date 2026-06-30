class Solution {
    public int numberOfSubstrings(String s) {
       Map<Character,Integer> map=new HashMap<>();
       int low=0;
       int count=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
                count+=s.length()-high;
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);

                if(map.get(left)==0){
                    map.remove(left);
                }

low++;
            }
        }
        return count;
        
        
    }
}