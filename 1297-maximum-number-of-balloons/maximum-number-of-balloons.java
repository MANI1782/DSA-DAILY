class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        String ans="balloon";
        int count=ans.length();
        int output=0;
        for(int i=0;i<ans.length();i++){
            char ch=ans.charAt(i);
            if(map.containsKey(ch)){
                count--;
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }if(count==0){
                    output++;
                    count=ans.length();
                    i=-1;
                 }
               
            }
            
        }
        
        return output;
        
    }
}