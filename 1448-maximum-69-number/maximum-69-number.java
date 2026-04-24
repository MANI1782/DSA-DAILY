class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        String res="";
        int times=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6' && times>=1){
                res=res+'9';
                times--;

            }else{
                res=res+ch;
            }
        }
        int ans=Integer.parseInt(res);
        return ans;
       
        
    }
}