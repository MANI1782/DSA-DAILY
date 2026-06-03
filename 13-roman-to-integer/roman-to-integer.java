class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> freq=new HashMap<>();
        
        freq.put('I',1);
        freq.put('V',5);
        freq.put('X',10);
        freq.put('L',50);
        freq.put('C',100);
        freq.put('D',500);
        freq.put('M',1000);
        int res = 0;
        int prev=0;
        int i = s.length()-1;
        while(i>=0){
            int curr = freq.get(s.charAt(i));
           if(curr>prev){
            res=res+curr;
        
           }else if(curr<prev){
            res=res-curr;
    
           }
           else if(curr == prev){
            res=res+curr;
           }
           prev=curr;
           i--;
            
        }
        return res;

     
    }
}