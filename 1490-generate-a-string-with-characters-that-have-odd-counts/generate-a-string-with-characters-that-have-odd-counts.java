class Solution {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        char ch='a';
        char ch1='b';
        if(n%2==0){
            while(n!=1){
                sb.append(ch);
                n--;

            }
            sb.append(ch1);
        }else{
            while(n!=0){
                sb.append(ch);
                n--;
            }
        }
        return sb.toString();
    }
}