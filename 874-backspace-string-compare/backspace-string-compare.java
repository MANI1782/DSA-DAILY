class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }else if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }else{
                    continue;
                }
            }
        }
         for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }else if(t.charAt(i)=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }else{
                    continue;
                }
            }
        }

        String s1="";
        String s2="";

        while(!st1.isEmpty()){
            s1=s1+st1.pop();
            
        }
        while(!st2.isEmpty()){
            s2=s2+st2.pop();
        }
        return s1.equals(s2);

        
        
    }
}