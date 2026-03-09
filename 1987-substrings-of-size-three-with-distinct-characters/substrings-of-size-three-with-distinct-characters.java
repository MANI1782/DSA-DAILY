class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int low=0;
        int count=0;
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(high-low+1>3){
              
                char left=s.charAt(low);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                low++;
            }
              if(map.size()==3){
                    count++;
                }
        }
        
        
       
        return count;
        

    }
}