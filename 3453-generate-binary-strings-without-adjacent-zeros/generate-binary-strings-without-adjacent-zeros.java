class Solution {
    public List<String> validStrings(int n) {
        List<String> res=new ArrayList<>();
        track(n,0,res,new StringBuilder());
        return res;
        
    }
    void track(int n,int idx,List<String> res,StringBuilder sb){
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        
            
       
            sb.append("1");
            track(n,idx+1,res,sb);
            sb.deleteCharAt(sb.length()-1);

            if( sb.length()==0 || sb.charAt(idx-1)!='0'){
                sb.append("0");
                track(n,idx+1,res,sb);
                sb.deleteCharAt(sb.length()-1);
            }
            
        
            

        

    }
}