class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strS=strs[0];
        String strE=strs[strs.length-1];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<strS.length();i++){
            if(strS.charAt(i)==strE.charAt(i)){
                sb.append(strS.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();


        
    }
}