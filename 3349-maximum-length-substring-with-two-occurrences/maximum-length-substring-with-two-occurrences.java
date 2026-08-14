class Solution {
    public int maximumLengthSubstring(String s) {
        int res=Integer.MIN_VALUE;
        int low=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char ch1=s.charAt(low);
                map.put(ch1,map.get(ch1)-1);
                low++;
            }
            if(map.get(ch)<=2){
                res=Math.max(res,high-low+1);
            }



        }
        return res;
        
    }
}