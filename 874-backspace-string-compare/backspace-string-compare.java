class Solution {
    public boolean backspaceCompare(String s, String t) {
     Stack<Character> stack1=new Stack<>();
     Stack<Character> stack2=new Stack<>();
     
     for(int i=0;i<s.length();i++){
        char left=s.charAt(i);
        if(!stack1.isEmpty() && left=='#'){
            stack1.pop();
        }else if(left!='#'){
        stack1.push(left);
        }else{
            continue;
        }
     }

    for(int i=0;i<t.length();i++){
        char left=t.charAt(i);
        if(!stack2.isEmpty() && left=='#'){
            stack2.pop();
        }else if(left!='#'){
        stack2.push(left);
    }else{
        continue;
    }
    }
    StringBuilder sb1=new StringBuilder();
    StringBuilder sb2=new StringBuilder();
    for(int i=0;i<stack1.size();i++){
        sb1.append(stack1.get(i));
    }
    for(int i=0;i<stack2.size();i++){
        sb2.append(stack2.get(i));
    }
    return sb1.toString().equals(sb2.toString());
        
        
    }
}