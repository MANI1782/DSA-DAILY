class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> list=new ArrayList<>();

        for(String q:queries){
            for(String d:dictionary){
                int diff=0;
                for(int i=0;i<d.length();i++){
                    if(d.charAt(i)!=q.charAt(i)){
                        diff++;
                    }
                    
                }
                if(diff<=2){
                    list.add(q);
                    break;
                }

                
            }
        
        }
        return list;

        
    }
}