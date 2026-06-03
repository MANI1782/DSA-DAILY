class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res = 0;
        int prev = 0;
        int i=s.length()-1;
        while(i>=0){
            int curr = map.get(s.charAt(i));  
            if(curr>prev){
                res+=curr;
            }
            else if(curr<prev){
                res-=curr;
            }
            else if(curr==prev){
                res+=curr;
            }
            
            prev = curr;
            i--;
        }
    return res;
    }
    
}