class Solution {
    public int passwordStrength(String password) {
        int count=0;
        Set<Character> set=new HashSet();

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(!set.contains(ch)){

            if(Character.isLowerCase(ch)){
                count=count+1;
            }else if(Character.isUpperCase(ch)){
                count=count+2;
            }else if(Character.isDigit(ch)){
                count=count+3;
            }else{
                count=count+5;
            }
            }
            set.add(ch);
        }
        return count;
        
    }
}