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
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i < s.length() - 1 && freq.get(s.charAt(i))<freq.get(s.charAt(i+1))){
                res=res-freq.get(s.charAt(i));
            }else{
                    res=res+freq.get(s.charAt(i));
            }

            
        }
        return res;   
    }
}