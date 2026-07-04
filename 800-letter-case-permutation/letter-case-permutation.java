class Solution {
    public List<String> letterCasePermutation(String s) {
           List<String> res=new ArrayList<>();
           track(s,0,res,new StringBuilder());
           return res;
        
    }
    void track(String s,int idx,List<String> curr,StringBuilder sb){
        if(s.length()==idx){
            
            curr.add(sb.toString());
            return;
            
        }

        char ch=s.charAt(idx);
        sb.append(ch);
        track(s,idx+1,curr,sb);
        sb.deleteCharAt(sb.length()-1);

        if(Character.isLetter(ch)){
            char toggle=(char)(ch^32);
            sb.append(toggle);
            track(s,idx+1,curr,sb);
            sb.deleteCharAt(sb.length()-1);
        }
       
    }
}