class Solution {
    public int maxFreqSum(String s) {
       Map<Character,Integer> map=new HashMap<>();
       int vcount=0;
       int ccount=0;
       String vowel="aeiou";
       for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }

       for(char ch:map.keySet()){
        if(vowel.indexOf(ch)!=-1){
            if(vcount<map.get(ch)){
                vcount=map.get(ch);
            }
        }else{
            if(ccount<map.get(ch)){
                ccount=map.get(ch);
            }
        }
       }

       
    
       
       return vcount+ccount;
    }

}