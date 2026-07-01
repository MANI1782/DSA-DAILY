class Solution {
    public List<String> letterCombinations(String digits) {
         
        HashMap<Character, String> keyboard = new HashMap<>();
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");
        List<String> list=new ArrayList<>();
        backtrack(digits,0,list,new StringBuilder(),keyboard);

        return list;


        
    }
    void backtrack(String digits,int idx,List<String> list,StringBuilder sb,Map<Character,String> map){
        if(digits.length()==idx){
            list.add(sb.toString());
            return ;
        }
        String letter=map.get(digits.charAt(idx));
        for(char ch:letter.toCharArray()){
            sb.append(ch);
            backtrack(digits,idx+1,list,sb,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}