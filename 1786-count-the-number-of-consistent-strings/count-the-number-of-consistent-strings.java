class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;

        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<allowed.length();i++){
            char ch=allowed.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String word:words){
             boolean consistent = true;
        for(char ch:word.toCharArray()){
            if(!map.containsKey(ch)){
                consistent=false;
                break;
            }
        }
        if(consistent){
            count++;
        }

        
        
        }
        return count;

          
    }
}