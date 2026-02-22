class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> target=new HashMap<>();
        for(int i=0;i<p.length();i++){
            char c=p.charAt(i);
            target.put(c,target.getOrDefault(c,0)+1);
        }
        List<Integer> found=new ArrayList<>();
         Map<Character,Integer> windows=new HashMap<>();
         int low=0;
         int k=p.length();
         for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            windows.put(ch,windows.getOrDefault(ch,0)+1);

            while(high-low+1>k){
                char leftchar=s.charAt(low);
                if(windows.get(leftchar)==1){
                    windows.remove(leftchar);
                }else{
                windows.put(leftchar,windows.get(leftchar)-1);
                }
                low++;

            }
            if(windows.equals(target)){
                found.add(low);
            }
         }
         return found;
        
    }
}