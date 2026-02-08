class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String ,Integer> ans=new HashMap<>();   


        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");

        for(int i=0;i<words1.length;i++){
           String current1=words1[i];
            ans.put(current1,ans.getOrDefault(current1,0)+1);
        }
        for(int i=0;i<words2.length;i++){
            String current2=words2[i];
            ans.put(current2,ans.getOrDefault(current2,0)+1);
        }


        List<String> res=new ArrayList<>();
        for(String word: ans.keySet()){
            if(ans.get(word)==1){
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
       
        }
    

    }
